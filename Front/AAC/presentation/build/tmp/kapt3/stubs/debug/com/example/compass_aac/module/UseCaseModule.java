package com.example.compass_aac.module;

import android.speech.tts.TextToSpeech;
import com.example.data.repository.FindNodeRepository;
import com.example.domain.repository.FavoriteRepository;
import com.example.domain.repository.LocationRepository;
import com.example.domain.repository.UserRepository;
import com.example.domain.repository.VoiceRepository;
import com.example.domain.usecase.FavoriteUseCase;
import com.example.domain.usecase.LocationUseCase;
import com.example.domain.usecase.LoginUseCase;
import com.example.domain.usecase.RegisterUseCase;
import com.example.domain.usecase.VoiceUseCase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/example/compass_aac/module/UseCaseModule;", "", "()V", "provideFavoriteUseCase", "Lcom/example/domain/usecase/FavoriteUseCase;", "favoriteRepository", "Lcom/example/domain/repository/FavoriteRepository;", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "provideLocationUseCase", "Lcom/example/domain/usecase/LocationUseCase;", "locationRepository", "Lcom/example/domain/repository/LocationRepository;", "provideLoginUseCase", "Lcom/example/domain/usecase/LoginUseCase;", "repository", "Lcom/example/domain/repository/UserRepository;", "provideRegisterUseCase", "Lcom/example/domain/usecase/RegisterUseCase;", "provideVoiceUseCase", "Lcom/example/domain/usecase/VoiceUseCase;", "voiceRepository", "Lcom/example/domain/repository/VoiceRepository;", "presentation_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.compass_aac.module.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.usecase.LoginUseCase provideLoginUseCase(@org.jetbrains.annotations.NotNull
    com.example.domain.repository.UserRepository repository) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.usecase.RegisterUseCase provideRegisterUseCase(@org.jetbrains.annotations.NotNull
    com.example.domain.repository.UserRepository repository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.usecase.LocationUseCase provideLocationUseCase(@org.jetbrains.annotations.NotNull
    com.example.domain.repository.LocationRepository locationRepository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.usecase.VoiceUseCase provideVoiceUseCase(@org.jetbrains.annotations.NotNull
    com.example.domain.repository.VoiceRepository voiceRepository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.usecase.FavoriteUseCase provideFavoriteUseCase(@org.jetbrains.annotations.NotNull
    com.example.domain.repository.FavoriteRepository favoriteRepository, @org.jetbrains.annotations.NotNull
    android.speech.tts.TextToSpeech textToSpeech) {
        return null;
    }
}