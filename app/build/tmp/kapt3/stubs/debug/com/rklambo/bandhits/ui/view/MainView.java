package com.rklambo.bandhits.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\n"}, d2 = {"Lcom/rklambo/bandhits/ui/view/MainView;", "Lcom/rklambo/bandhits/ui/view/PresentationView;", "navigateToDetail", "", "id", "", "showArtists", "artists", "", "Lcom/rklambo/bandhits/ui/entity/ImageTitle;", "app_debug"})
public abstract interface MainView extends com.rklambo.bandhits.ui.view.PresentationView {
    
    public abstract void showArtists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.rklambo.bandhits.ui.entity.ImageTitle> artists);
    
    public abstract void navigateToDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}