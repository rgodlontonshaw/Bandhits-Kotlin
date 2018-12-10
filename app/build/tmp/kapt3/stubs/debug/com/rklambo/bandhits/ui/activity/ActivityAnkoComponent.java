package com.rklambo.bandhits.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/rklambo/bandhits/ui/activity/ActivityAnkoComponent;", "T", "Landroid/support/v7/app/AppCompatActivity;", "Lorg/jetbrains/anko/AnkoComponent;", "toolbar", "Landroid/support/v7/widget/Toolbar;", "getToolbar", "()Landroid/support/v7/widget/Toolbar;", "app_debug"})
public abstract interface ActivityAnkoComponent<T extends android.support.v7.app.AppCompatActivity> extends org.jetbrains.anko.AnkoComponent<T> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.support.v7.widget.Toolbar getToolbar();
}