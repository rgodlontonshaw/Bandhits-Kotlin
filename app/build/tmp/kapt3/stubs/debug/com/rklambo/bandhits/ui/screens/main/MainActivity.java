package com.rklambo.bandhits.ui.screens.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0017H\u0014J\b\u0010\u001f\u001a\u00020\u0017H\u0014J\u0016\u0010 \u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/rklambo/bandhits/ui/screens/main/MainActivity;", "Lcom/rklambo/bandhits/ui/activity/BaseActivity;", "Lcom/rklambo/bandhits/ui/screens/main/MainLayout;", "Lcom/rklambo/bandhits/ui/view/MainView;", "()V", "adapter", "Lcom/rklambo/bandhits/ui/adapter/ImageTitleAdapter;", "getAdapter", "()Lcom/rklambo/bandhits/ui/adapter/ImageTitleAdapter;", "presenter", "Lcom/rklambo/bandhits/ui/presenter/MainPresenter;", "getPresenter", "()Lcom/rklambo/bandhits/ui/presenter/MainPresenter;", "setPresenter", "(Lcom/rklambo/bandhits/ui/presenter/MainPresenter;)V", "ui", "getUi", "()Lcom/rklambo/bandhits/ui/screens/main/MainLayout;", "findItemById", "Landroid/view/View;", "id", "", "injectDependencies", "", "applicationComponent", "Lcom/rklambo/bandhits/di/ApplicationComponent;", "navigateToDetail", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "showArtists", "artists", "", "Lcom/rklambo/bandhits/ui/entity/ImageTitle;", "app_debug"})
public final class MainActivity extends com.rklambo.bandhits.ui.activity.BaseActivity<com.rklambo.bandhits.ui.screens.main.MainLayout> implements com.rklambo.bandhits.ui.view.MainView {
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.ui.screens.main.MainLayout ui = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.rklambo.bandhits.ui.presenter.MainPresenter presenter;
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.ui.adapter.ImageTitleAdapter adapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rklambo.bandhits.ui.screens.main.MainLayout getUi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.ui.presenter.MainPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.presenter.MainPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.ui.adapter.ImageTitleAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void injectDependencies(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.di.ApplicationComponent applicationComponent) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void showArtists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.rklambo.bandhits.ui.entity.ImageTitle> artists) {
    }
    
    @java.lang.Override()
    public void navigateToDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    private final android.view.View findItemById(java.lang.String id) {
        return null;
    }
    
    public MainActivity() {
        super();
    }
}