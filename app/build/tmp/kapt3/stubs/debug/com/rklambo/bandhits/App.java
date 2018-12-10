package com.rklambo.bandhits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/rklambo/bandhits/App;", "Landroid/app/Application;", "()V", "initializeDagger", "", "onCreate", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static com.rklambo.bandhits.di.ApplicationComponent graph;
    public static final com.rklambo.bandhits.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initializeDagger() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/rklambo/bandhits/App$Companion;", "", "()V", "graph", "Lcom/rklambo/bandhits/di/ApplicationComponent;", "getGraph", "()Lcom/rklambo/bandhits/di/ApplicationComponent;", "setGraph", "(Lcom/rklambo/bandhits/di/ApplicationComponent;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.rklambo.bandhits.di.ApplicationComponent getGraph() {
            return null;
        }
        
        public final void setGraph(@org.jetbrains.annotations.NotNull()
        com.rklambo.bandhits.di.ApplicationComponent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}