package com.rklambo.bandhits.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/rklambo/bandhits/di/RepositoryModule;", "", "()V", "provideAlbumRepo", "Lcom/rklambo/bandhits/domain/repository/AlbumRepository;", "lastFmService", "Lcom/rklambo/bandhits/data/lastfm/LastFmService;", "provideArtistRepo", "Lcom/rklambo/bandhits/domain/repository/ArtistRepository;", "language", "", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rklambo.bandhits.domain.repository.ArtistRepository provideArtistRepo(@org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.qualifier.LanguageSelection()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.LastFmService lastFmService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rklambo.bandhits.domain.repository.AlbumRepository provideAlbumRepo(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.LastFmService lastFmService) {
        return null;
    }
    
    public RepositoryModule() {
        super();
    }
}