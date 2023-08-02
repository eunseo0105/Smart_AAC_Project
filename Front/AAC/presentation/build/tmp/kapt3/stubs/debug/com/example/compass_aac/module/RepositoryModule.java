package com.example.compass_aac.module;

import com.example.data.repository.FindNodeRepositoryImpl;
import com.example.data.repository.LocationRepositoryImpl;
import com.example.data.repository.NodeRepositoryImpl;
import com.example.data.repository.UserRepositoryImpl;
import com.example.domain.repository.FindNodeRepository;
import com.example.domain.repository.LocationRepository;
import com.example.domain.repository.UserRepository;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/compass_aac/module/RepositoryModule;", "", "()V", "bindFindNodeRepository", "Lcom/example/domain/repository/FindNodeRepository;", "findNodeRepositoryImpl", "Lcom/example/data/repository/FindNodeRepositoryImpl;", "bindLocationRepository", "Lcom/example/domain/repository/LocationRepository;", "locationRepositoryImpl", "Lcom/example/data/repository/LocationRepositoryImpl;", "bindUserRepository", "Lcom/example/domain/repository/UserRepository;", "userRepositoryImpl", "Lcom/example/data/repository/UserRepositoryImpl;", "presentation_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.example.domain.repository.UserRepository bindUserRepository(@org.jetbrains.annotations.NotNull
    com.example.data.repository.UserRepositoryImpl userRepositoryImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.example.domain.repository.LocationRepository bindLocationRepository(@org.jetbrains.annotations.NotNull
    com.example.data.repository.LocationRepositoryImpl locationRepositoryImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.example.domain.repository.FindNodeRepository bindFindNodeRepository(@org.jetbrains.annotations.NotNull
    com.example.data.repository.FindNodeRepositoryImpl findNodeRepositoryImpl);
}