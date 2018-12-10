package com.rklambo.bandhits.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0012\u0010\u0004\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/rklambo/bandhits/ui/activity/ViewAnkoComponent;", "T", "Landroid/view/ViewGroup;", "Lorg/jetbrains/anko/AnkoComponent;", "view", "getView", "()Landroid/view/ViewGroup;", "inflate", "Landroid/view/View;", "app_debug"})
public abstract interface ViewAnkoComponent<T extends android.view.ViewGroup> extends org.jetbrains.anko.AnkoComponent<T> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract T getView();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View inflate();
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static <T extends android.view.ViewGroup>android.view.View inflate(com.rklambo.bandhits.ui.activity.ViewAnkoComponent<T> $this) {
            return null;
        }
    }
}