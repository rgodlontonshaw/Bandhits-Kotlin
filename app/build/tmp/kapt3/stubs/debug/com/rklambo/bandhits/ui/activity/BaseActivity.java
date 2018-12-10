package com.rklambo.bandhits.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000f*\u0012\b\u0000\u0010\u0001 \u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u00020\u0003:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0015R\u0012\u0010\u0005\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/rklambo/bandhits/ui/activity/BaseActivity;", "UI", "Lcom/rklambo/bandhits/ui/activity/ActivityAnkoComponent;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "ui", "getUi", "()Lcom/rklambo/bandhits/ui/activity/ActivityAnkoComponent;", "injectDependencies", "", "applicationComponent", "Lcom/rklambo/bandhits/di/ApplicationComponent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public abstract class BaseActivity<UI extends com.rklambo.bandhits.ui.activity.ActivityAnkoComponent<? extends android.support.v7.app.AppCompatActivity>> extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_TRANSITION_NAME = "activity_image_transition";
    public static final com.rklambo.bandhits.ui.activity.BaseActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract UI getUi();
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void injectDependencies(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.di.ApplicationComponent applicationComponent);
    
    public BaseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/rklambo/bandhits/ui/activity/BaseActivity$Companion;", "", "()V", "IMAGE_TRANSITION_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}