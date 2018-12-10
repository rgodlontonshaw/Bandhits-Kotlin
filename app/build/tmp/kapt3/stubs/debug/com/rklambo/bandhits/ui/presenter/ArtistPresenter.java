package com.rklambo.bandhits.ui.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B=\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020 R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/rklambo/bandhits/ui/presenter/ArtistPresenter;", "Lcom/rklambo/bandhits/ui/presenter/Presenter;", "Lcom/rklambo/bandhits/ui/view/ArtistView;", "Lcom/rklambo/bandhits/ui/presenter/AlbumsPresenter;", "view", "bus", "Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "artistDetailInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetArtistDetailInteractor;", "topAlbumsInteractor", "Lcom/rklambo/bandhits/domain/interactor/GetTopAlbumsInteractor;", "interactorExecutor", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;", "artistDetailMapper", "Lcom/rklambo/bandhits/ui/entity/mapper/ArtistDetailDataMapper;", "albumsMapper", "Lcom/rklambo/bandhits/ui/entity/mapper/ImageTitleDataMapper;", "(Lcom/rklambo/bandhits/ui/view/ArtistView;Lcom/rklambo/bandhits/domain/interactor/base/Bus;Lcom/rklambo/bandhits/domain/interactor/GetArtistDetailInteractor;Lcom/rklambo/bandhits/domain/interactor/GetTopAlbumsInteractor;Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;Lcom/rklambo/bandhits/ui/entity/mapper/ArtistDetailDataMapper;Lcom/rklambo/bandhits/ui/entity/mapper/ImageTitleDataMapper;)V", "getBus", "()Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "getView", "()Lcom/rklambo/bandhits/ui/view/ArtistView;", "init", "", "artistId", "", "onAlbumClicked", "item", "Lcom/rklambo/bandhits/ui/entity/ImageTitle;", "onEvent", "event", "Lcom/rklambo/bandhits/domain/interactor/event/ArtistDetailEvent;", "Lcom/rklambo/bandhits/domain/interactor/event/TopAlbumsEvent;", "app_debug"})
public class ArtistPresenter implements com.rklambo.bandhits.ui.presenter.Presenter<com.rklambo.bandhits.ui.view.ArtistView>, com.rklambo.bandhits.ui.presenter.AlbumsPresenter {
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.ui.view.ArtistView view = null;
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.domain.interactor.base.Bus bus = null;
    private final com.rklambo.bandhits.domain.interactor.GetArtistDetailInteractor artistDetailInteractor = null;
    private final com.rklambo.bandhits.domain.interactor.GetTopAlbumsInteractor topAlbumsInteractor = null;
    private final com.rklambo.bandhits.domain.interactor.base.InteractorExecutor interactorExecutor = null;
    private final com.rklambo.bandhits.ui.entity.mapper.ArtistDetailDataMapper artistDetailMapper = null;
    private final com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper albumsMapper = null;
    
    public void init(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.event.ArtistDetailEvent event) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.event.TopAlbumsEvent event) {
    }
    
    @java.lang.Override()
    public void onAlbumClicked(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.ImageTitle item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rklambo.bandhits.ui.view.ArtistView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rklambo.bandhits.domain.interactor.base.Bus getBus() {
        return null;
    }
    
    public ArtistPresenter(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.view.ArtistView view, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Bus bus, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.GetArtistDetailInteractor artistDetailInteractor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.GetTopAlbumsInteractor topAlbumsInteractor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.InteractorExecutor interactorExecutor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.mapper.ArtistDetailDataMapper artistDetailMapper, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper albumsMapper) {
        super();
    }
    
    public void onResume() {
    }
    
    public void onPause() {
    }
}