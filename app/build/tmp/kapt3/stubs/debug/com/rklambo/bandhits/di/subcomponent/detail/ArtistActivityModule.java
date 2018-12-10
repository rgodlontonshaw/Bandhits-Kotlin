package com.rklambo.bandhits.di.subcomponent.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J@\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0012H\u0007J\b\u0010\u0018\u001a\u00020\bH\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u0014H\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/rklambo/bandhits/di/subcomponent/detail/ArtistActivityModule;", "Lcom/rklambo/bandhits/di/ActivityModule;", "activity", "Lcom/rklambo/bandhits/ui/screens/detail/ArtistActivity;", "(Lcom/rklambo/bandhits/ui/screens/detail/ArtistActivity;)V", "provideActivityPresenter", "Lcom/rklambo/bandhits/ui/presenter/ArtistPresenter;", "view", "Lcom/rklambo/bandhits/ui/view/ArtistView;", "bus", "Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "artistDetailInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetArtistDetailInteractor;", "topAlbumsInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetTopAlbumsInteractor;", "interactorExecutor", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;", "detailDataMapper", "Lcom/rklambo/bandhits/ui/entity/mapper/ArtistDetailDataMapper;", "imageTitleDataMapper", "Lcom/rklambo/bandhits/ui/entity/mapper/ImageTitleDataMapper;", "provideAlbumsFragment", "Lcom/rklambo/bandhits/ui/screens/detail/AlbumsFragment;", "provideArtistDataMapper", "provideArtistView", "provideBiographyFragment", "Lcom/rklambo/bandhits/ui/screens/detail/BiographyFragment;", "provideImageTitleDataMapper", "app_debug"})
@dagger.Module()
public final class ArtistActivityModule extends com.rklambo.bandhits.di.ActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.view.ArtistView provideArtistView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.entity.mapper.ArtistDetailDataMapper provideArtistDataMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper provideImageTitleDataMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.presenter.ArtistPresenter provideActivityPresenter(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.view.ArtistView view, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Bus bus, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.GetArtistDetailInteractor artistDetailInteractor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.GetTopAlbumsInteractor topAlbumsInteractor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.InteractorExecutor interactorExecutor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.mapper.ArtistDetailDataMapper detailDataMapper, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper imageTitleDataMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.screens.detail.AlbumsFragment provideAlbumsFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.screens.detail.BiographyFragment provideBiographyFragment() {
        return null;
    }
    
    public ArtistActivityModule(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.screens.detail.ArtistActivity activity) {
        super(null);
    }
}