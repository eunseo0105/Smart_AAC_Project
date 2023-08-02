package com.example.compass_aac.module

import com.example.data.api.UserApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class UserModule {
    @Singleton
    @Provides
    fun provideLoginApi(retrofit: Retrofit): UserApiService {
        return retrofit.create(UserApiService::class.java)
    }

}