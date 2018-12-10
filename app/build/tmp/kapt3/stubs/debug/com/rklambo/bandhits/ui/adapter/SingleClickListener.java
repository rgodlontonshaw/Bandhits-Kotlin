package com.rklambo.bandhits.ui.adapter;

import java.lang.System;

/**
 * * Prevents from double clicks on a view, which could otherwise lead to unpredictable states. Useful
 * * while transitioning to another activity for instance.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/rklambo/bandhits/ui/adapter/SingleClickListener;", "Landroid/view/View$OnClickListener;", "click", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "", "(Lkotlin/jvm/functions/Function1;)V", "lastClick", "", "getLastClickTimeout", "onClick", "Companion", "app_debug"})
public final class SingleClickListener implements android.view.View.OnClickListener {
    private long lastClick;
    private final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> click = null;
    private static final int DOUBLE_CLICK_TIMEOUT = 0;
    public static final com.rklambo.bandhits.ui.adapter.SingleClickListener.Companion Companion = null;
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final long getLastClickTimeout() {
        return 0L;
    }
    
    public SingleClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> click) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/rklambo/bandhits/ui/adapter/SingleClickListener$Companion;", "", "()V", "DOUBLE_CLICK_TIMEOUT", "", "getDOUBLE_CLICK_TIMEOUT", "()I", "app_debug"})
    public static final class Companion {
        
        private final int getDOUBLE_CLICK_TIMEOUT() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}