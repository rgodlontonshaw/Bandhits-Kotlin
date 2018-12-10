package com.rklambo.bandhits.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/rklambo/bandhits/ui/view/ArtistView;", "Lcom/rklambo/bandhits/ui/view/PresentationView;", "navigateToAlbum", "", "albumId", "", "showAlbums", "albums", "", "Lcom/rklambo/bandhits/ui/entity/ImageTitle;", "showArtist", "artistDetail", "Lcom/rklambo/bandhits/ui/entity/ArtistDetail;", "app_debug"})
public abstract interface ArtistView extends com.rklambo.bandhits.ui.view.PresentationView {
    
    public abstract void showArtist(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.entity.ArtistDetail artistDetail);
    
    public abstract void showAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.rklambo.bandhits.ui.entity.ImageTitle> albums);
    
    public abstract void navigateToAlbum(@org.jetbrains.annotations.NotNull()
    java.lang.String albumId);
}