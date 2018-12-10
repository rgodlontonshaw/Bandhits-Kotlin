package com.rklambo.bandhits.di.subcomponent.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/rklambo/bandhits/di/subcomponent/album/AlbumActivityComponent;", "", "injectTo", "", "activity", "Lcom/rklambo/bandhits/ui/screens/album/AlbumActivity;", "app_debug"})
@dagger.Subcomponent(modules = {com.rklambo.bandhits.di.subcomponent.album.AlbumActivityModule.class})
@com.rklambo.bandhits.di.scope.ActivityScope()
public abstract interface AlbumActivityComponent {
    
    public abstract void injectTo(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.screens.album.AlbumActivity activity);
}