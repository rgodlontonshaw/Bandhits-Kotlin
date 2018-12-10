package com.rklambo.bandhits.di.subcomponent.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J\b\u0010\u0012\u001a\u00020\nH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/rklambo/bandhits/di/subcomponent/album/AlbumActivityModule;", "Lcom/rklambo/bandhits/di/ActivityModule;", "activity", "Lcom/rklambo/bandhits/ui/screens/album/AlbumActivity;", "(Lcom/rklambo/bandhits/ui/screens/album/AlbumActivity;)V", "provideAlbumDataMapper", "Lcom/rklambo/bandhits/ui/entity/mapper/AlbumDetailDataMapper;", "provideAlbumPresenter", "Lcom/rklambo/bandhits/ui/presenter/AlbumPresenter;", "view", "Lcom/rklambo/bandhits/ui/view/AlbumView;", "bus", "Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "albumInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetAlbumDetailInteractor;", "interactorExecutor", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;", "albumDetailDataMapper", "provideAlbumView", "provideLinearLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "provideTrackDataMapper", "Lcom/rklambo/bandhits/ui/entity/mapper/TrackDataMapper;", "provideTracksAdapter", "Lcom/rklambo/bandhits/ui/adapter/TracksAdapter;", "app_debug"})
@dagger.Module()
public final class AlbumActivityModule extends com.rklambo.bandhits.di.ActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.view.AlbumView provideAlbumView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.entity.mapper.AlbumDetailDataMapper provideAlbumDataMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.entity.mapper.TrackDataMapper provideTrackDataMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final android.support.v7.widget.LinearLayoutManager provideLinearLayoutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.adapter.TracksAdapter provideTracksAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.presenter.AlbumPresenter provideAlbumPresenter(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.view.AlbumView view, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Bus bus, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.GetAlbumDetailInteractor albumInteractor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.InteractorExecutor interactorExecutor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.mapper.AlbumDetailDataMapper albumDetailDataMapper) {
        return null;
    }
    
    public AlbumActivityModule(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.screens.album.AlbumActivity activity) {
        super(null);
    }
}