package com.rklambo.bandhits.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/rklambo/bandhits/ui/view/AlbumView;", "Lcom/rklambo/bandhits/ui/view/PresentationView;", "showAlbum", "", "albumDetail", "Lcom/rklambo/bandhits/ui/entity/AlbumDetail;", "app_debug"})
public abstract interface AlbumView extends com.rklambo.bandhits.ui.view.PresentationView {
    
    public abstract void showAlbum(@org.jetbrains.annotations.Nullable()
    com.rklambo.bandhits.ui.entity.AlbumDetail albumDetail);
}