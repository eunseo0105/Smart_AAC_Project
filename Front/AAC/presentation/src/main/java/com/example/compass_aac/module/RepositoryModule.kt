package com.example.compass_aac.module

import com.example.data.repository.FindNodeRepositoryImpl
import com.example.data.repository.LocationRepositoryImpl
import com.example.data.repository.NodeRepositoryImpl
import com.example.data.repository.UserRepositoryImpl
import com.example.domain.repository.FindNodeRepository
import com.example.domain.repository.LocationRepository
import com.example.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository

    @Binds
    abstract fun bindLocationRepository(locationRepositoryImpl: LocationRepositoryImpl) : LocationRepository


    @Binds
    abstract fun bindFindNodeRepository(findNodeRepositoryImpl: FindNodeRepositoryImpl) : FindNodeRepository
}