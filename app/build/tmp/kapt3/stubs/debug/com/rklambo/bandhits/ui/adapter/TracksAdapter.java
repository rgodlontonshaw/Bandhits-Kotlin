package com.rklambo.bandhits.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0002R:\u0010\u0005\u001a(\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\u0002\b\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/rklambo/bandhits/ui/adapter/TracksAdapter;", "Lcom/rklambo/bandhits/ui/adapter/BaseAdapter;", "Lcom/rklambo/bandhits/ui/entity/TrackDetail;", "Lcom/rklambo/bandhits/ui/adapter/TracksAdapter$Component;", "()V", "bind", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "", "Lkotlin/ExtensionFunctionType;", "getBind", "()Lkotlin/jvm/functions/Function2;", "timeStampPattern", "", "timeSystemBaseNumber", "", "onCreateComponent", "parent", "Landroid/support/v7/widget/RecyclerView;", "secondsToTrackDurationString", "Component", "app_debug"})
public final class TracksAdapter extends com.rklambo.bandhits.ui.adapter.BaseAdapter<com.rklambo.bandhits.ui.entity.TrackDetail, com.rklambo.bandhits.ui.adapter.TracksAdapter.Component> {
    private final java.lang.String timeStampPattern = "%d:%02d";
    private final int timeSystemBaseNumber = 60;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<com.rklambo.bandhits.ui.adapter.TracksAdapter.Component, com.rklambo.bandhits.ui.entity.TrackDetail, kotlin.Unit> bind = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function2<com.rklambo.bandhits.ui.adapter.TracksAdapter.Component, com.rklambo.bandhits.ui.entity.TrackDetail, kotlin.Unit> getBind() {
        return null;
    }
    
    private final java.lang.String secondsToTrackDurationString(com.rklambo.bandhits.ui.entity.TrackDetail item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rklambo.bandhits.ui.adapter.TracksAdapter.Component onCreateComponent(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView parent) {
        return null;
    }
    
    public TracksAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/rklambo/bandhits/ui/adapter/TracksAdapter$Component;", "Lcom/rklambo/bandhits/ui/activity/ViewAnkoComponent;", "Landroid/support/v7/widget/RecyclerView;", "view", "(Landroid/support/v7/widget/RecyclerView;)V", "length", "Landroid/widget/TextView;", "getLength", "()Landroid/widget/TextView;", "setLength", "(Landroid/widget/TextView;)V", "name", "getName", "setName", "number", "getNumber", "setNumber", "getView", "()Landroid/support/v7/widget/RecyclerView;", "createView", "Landroid/widget/LinearLayout;", "ui", "Lorg/jetbrains/anko/AnkoContext;", "app_debug"})
    public static final class Component implements com.rklambo.bandhits.ui.activity.ViewAnkoComponent<android.support.v7.widget.RecyclerView> {
        @org.jetbrains.annotations.NotNull()
        public android.widget.TextView number;
        @org.jetbrains.annotations.NotNull()
        public android.widget.TextView name;
        @org.jetbrains.annotations.NotNull()
        public android.widget.TextView length;
        @org.jetbrains.annotations.NotNull()
        private final android.support.v7.widget.RecyclerView view = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNumber() {
            return null;
        }
        
        public final void setNumber(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getLength() {
            return null;
        }
        
        public final void setLength(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.widget.LinearLayout createView(@org.jetbrains.annotations.NotNull()
        org.jetbrains.anko.AnkoContext<? extends android.support.v7.widget.RecyclerView> ui) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.support.v7.widget.RecyclerView getView() {
            return null;
        }
        
        public Component(@org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView view) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public android.view.View inflate() {
            return null;
        }
    }
}