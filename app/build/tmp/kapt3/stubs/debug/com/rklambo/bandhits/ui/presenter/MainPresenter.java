package com.rklambo.bandhits.ui.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0012H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/rklambo/bandhits/ui/presenter/MainPresenter;", "Lcom/rklambo/bandhits/ui/presenter/Presenter;", "Lcom/rklambo/bandhits/ui/view/MainView;", "view", "bus", "Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "recommendedArtistsInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetRecommendedArtistsInteractor;", "interactorExecutor", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;", "mapper", "Lcom/rklambo/bandhits/ui/entity/mapper/ImageTitleDataMapper;", "(Lcom/rklambo/bandhits/ui/view/MainView;Lcom/rklambo/bandhits/domain/interactor/base/Bus;Lcom/rklambo/bandhits/domain/interactor/GetRecommendedArtistsInteractor;Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;Lcom/rklambo/bandhits/ui/entity/mapper/ImageTitleDataMapper;)V", "getBus", "()Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "getView", "()Lcom/rklambo/bandhits/ui/view/MainView;", "onArtistClicked", "", "item", "Lcom/rklambo/bandhits/ui/entity/ImageTitle;", "onEvent", "event", "Lcom/rklambo/bandhits/domain/interactor/event/ArtistsEvent;", "onResume", "app_debug"})
public final class MainPresenter implements com.rklambo.bandhits.ui.presenter.Presenter<com.rklambo.bandhits.ui.view.MainView> {
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.ui.view.MainView view = null;
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.domain.interactor.base.Bus bus = null;
    private final com.rklambo.bandhits.domain.interactor.GetRecommendedArtistsInteractor recommendedArtistsInteractor = null;
    private final com.rklambo.bandhits.domain.interactor.base.InteractorExecutor interactorExecutor = null;
    private final com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper mapper = null;
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.event.ArtistsEvent event) {
    }
    
    public final void onArtistClicked(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.ImageTitle item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rklambo.bandhits.ui.view.MainView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rklambo.bandhits.domain.interactor.base.Bus getBus() {
        return null;
    }
    
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.view.MainView view, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Bus bus, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.GetRecommendedArtistsInteractor recommendedArtistsInteractor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.InteractorExecutor interactorExecutor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper mapper) {
        super();
    }
    
    public void onPause() {
    }
}