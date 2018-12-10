package com.rklambo.bandhits.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/rklambo/bandhits/di/DomainModule;", "", "()V", "provideAlbumsDetailInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetAlbumDetailInteractor;", "albumRepository", "Lcom/rklambo/bandhits/domain/repository/AlbumRepository;", "provideArtistDetailInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetArtistDetailInteractor;", "artistRepository", "Lcom/rklambo/bandhits/domain/repository/ArtistRepository;", "provideRecommendedArtistsInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetRecommendedArtistsInteractor;", "provideTopAlbumsInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetTopAlbumsInteractor;", "app_debug"})
@dagger.Module()
public final class DomainModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.rklambo.bandhits.domain.interactor.GetRecommendedArtistsInteractor provideRecommendedArtistsInteractor(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.repository.ArtistRepository artistRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.rklambo.bandhits.domain.interactor.GetArtistDetailInteractor provideArtistDetailInteractor(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.repository.ArtistRepository artistRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.rklambo.bandhits.domain.interactor.GetTopAlbumsInteractor provideTopAlbumsInteractor(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.repository.AlbumRepository albumRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.rklambo.bandhits.domain.interactor.GetAlbumDetailInteractor provideAlbumsDetailInteractor(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.repository.AlbumRepository albumRepository) {
        return null;
    }
    
    public DomainModule() {
        super();
    }
}