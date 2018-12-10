package com.rklambo.bandhits.ui.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/rklambo/bandhits/ui/presenter/Presenter;", "T", "", "bus", "Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "getBus", "()Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "view", "getView", "()Ljava/lang/Object;", "onPause", "", "onResume", "app_debug"})
public abstract interface Presenter<T extends java.lang.Object> {
    
    public abstract T getView();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rklambo.bandhits.domain.interactor.base.Bus getBus();
    
    public abstract void onResume();
    
    public abstract void onPause();
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        public static <T extends java.lang.Object>void onResume(com.rklambo.bandhits.ui.presenter.Presenter<? extends T> $this) {
        }
        
        public static <T extends java.lang.Object>void onPause(com.rklambo.bandhits.ui.presenter.Presenter<? extends T> $this) {
        }
    }
}