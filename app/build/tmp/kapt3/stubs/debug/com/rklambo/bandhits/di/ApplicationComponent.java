package com.rklambo.bandhits.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/rklambo/bandhits/di/ApplicationComponent;", "", "plus", "Lcom/rklambo/bandhits/di/subcomponent/album/AlbumActivityComponent;", "module", "Lcom/rklambo/bandhits/di/subcomponent/album/AlbumActivityModule;", "Lcom/rklambo/bandhits/di/subcomponent/detail/ArtistActivityComponent;", "Lcom/rklambo/bandhits/di/subcomponent/detail/ArtistActivityModule;", "Lcom/rklambo/bandhits/di/subcomponent/main/MainActivityComponent;", "Lcom/rklambo/bandhits/di/subcomponent/main/MainActivityModule;", "app_debug"})
@dagger.Component(modules = {com.rklambo.bandhits.di.ApplicationModule.class, com.rklambo.bandhits.di.DataModule.class, com.rklambo.bandhits.di.RepositoryModule.class, com.rklambo.bandhits.di.DomainModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rklambo.bandhits.di.subcomponent.main.MainActivityComponent plus(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.di.subcomponent.main.MainActivityModule module);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rklambo.bandhits.di.subcomponent.detail.ArtistActivityComponent plus(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.di.subcomponent.detail.ArtistActivityModule module);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rklambo.bandhits.di.subcomponent.album.AlbumActivityComponent plus(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.di.subcomponent.album.AlbumActivityModule module);
}