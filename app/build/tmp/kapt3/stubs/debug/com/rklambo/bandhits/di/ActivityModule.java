package com.rklambo.bandhits.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0007J\b\u0010\b\u001a\u00020\tH\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/rklambo/bandhits/di/ActivityModule;", "", "activity", "Landroid/support/v7/app/AppCompatActivity;", "(Landroid/support/v7/app/AppCompatActivity;)V", "getActivity", "()Landroid/support/v7/app/AppCompatActivity;", "provideActivity", "provideActiviyContext", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public abstract class ActivityModule {
    @org.jetbrains.annotations.NotNull()
    private final android.support.v7.app.AppCompatActivity activity = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final android.support.v7.app.AppCompatActivity provideActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.scope.ActivityScope()
    @dagger.Provides()
    public final android.content.Context provideActiviyContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.support.v7.app.AppCompatActivity getActivity() {
        return null;
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity activity) {
        super();
    }
}