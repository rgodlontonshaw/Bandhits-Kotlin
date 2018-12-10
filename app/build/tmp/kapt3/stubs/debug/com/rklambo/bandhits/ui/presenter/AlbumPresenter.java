package com.rklambo.bandhits.ui.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/rklambo/bandhits/ui/presenter/AlbumPresenter;", "Lcom/rklambo/bandhits/ui/presenter/Presenter;", "Lcom/rklambo/bandhits/ui/view/AlbumView;", "view", "bus", "Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "albumInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetAlbumDetailInteractor;", "interactorExecutor", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;", "albumDetailMapper", "Lcom/rklambo/bandhits/ui/entity/mapper/AlbumDetailDataMapper;", "(Lcom/rklambo/bandhits/ui/view/AlbumView;Lcom/rklambo/bandhits/domain/interactor/base/Bus;Lcom/rklambo/bandhits/domain/interactor/GetAlbumDetailInteractor;Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;Lcom/rklambo/bandhits/ui/entity/mapper/AlbumDetailDataMapper;)V", "getBus", "()Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "getView", "()Lcom/rklambo/bandhits/ui/view/AlbumView;", "init", "", "albumId", "", "onEvent", "event", "Lcom/rklambo/bandhits/domain/interactor/event/AlbumEvent;", "app_debug"})
public class AlbumPresenter implements com.rklambo.bandhits.ui.presenter.Presenter<com.rklambo.bandhits.ui.view.AlbumView> {
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.ui.view.AlbumView view = null;
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.domain.interactor.base.Bus bus = null;
    private final com.rklambo.bandhits.domain.interactor.GetAlbumDetailInteractor albumInteractor = null;
    private final com.rklambo.bandhits.domain.interactor.base.InteractorExecutor interactorExecutor = null;
    private final com.rklambo.bandhits.ui.entity.mapper.AlbumDetailDataMapper albumDetailMapper = null;
    
    public void init(@org.jetbrains.annotations.NotNull()
    java.lang.String albumId) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.event.AlbumEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rklambo.bandhits.ui.view.AlbumView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rklambo.bandhits.domain.interactor.base.Bus getBus() {
        return null;
    }
    
    public AlbumPresenter(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.view.AlbumView view, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Bus bus, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.GetAlbumDetailInteractor albumInteractor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.InteractorExecutor interactorExecutor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.mapper.AlbumDetailDataMapper albumDetailMapper) {
        super();
    }
    
    public void onResume() {
    }
    
    public void onPause() {
    }
}