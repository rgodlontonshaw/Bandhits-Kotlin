package com.rklambo.bandhits.di.subcomponent.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J\b\u0010\u0012\u001a\u00020\nH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/rklambo/bandhits/di/subcomponent/main/MainActivityModule;", "Lcom/rklambo/bandhits/di/ActivityModule;", "activity", "Lcom/rklambo/bandhits/ui/screens/main/MainActivity;", "(Lcom/rklambo/bandhits/ui/screens/main/MainActivity;)V", "provideImageTitleMapper", "Lcom/rklambo/bandhits/ui/entity/mapper/ImageTitleDataMapper;", "provideMainPresenter", "Lcom/rklambo/bandhits/ui/presenter/MainPresenter;", "view", "Lcom/rklambo/bandhits/ui/view/MainView;", "bus", "Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "recommendedArtistsInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetRecommendedArtistsInteractor;", "interactorExecutor", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;", "imageMapper", "provideMainView", "app_debug"})
@dagger.Module()
public final class MainActivityModule extends com.rklambo.bandhits.di.ActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.view.MainView provideMainView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper provideImageTitleMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final com.rklambo.bandhits.ui.presenter.MainPresenter provideMainPresenter(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.view.MainView view, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Bus bus, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.GetRecommendedArtistsInteractor recommendedArtistsInteractor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.InteractorExecutor interactorExecutor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper imageMapper) {
        return null;
    }
    
    public MainActivityModule(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.screens.main.MainActivity activity) {
        super(null);
    }
}