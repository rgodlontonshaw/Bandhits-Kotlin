package com.rklambo.bandhits.ui.custom;

import java.lang.System;

/**
 * * AutofitRecyclerView was originally explained by Chiu-Ki Chan and explained on its blog:
 * * http://blog.sqisland.com/2014/12/recyclerview-autofit-grid.html
 * *
 * * I just converted to Kotlin code.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0014R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001e"}, d2 = {"Lcom/rklambo/bandhits/ui/custom/AutofitRecyclerView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "columnWidth", "getColumnWidth", "()I", "setColumnWidth", "(I)V", "<set-?>", "Landroid/support/v7/widget/GridLayoutManager;", "manager", "getManager", "()Landroid/support/v7/widget/GridLayoutManager;", "setManager", "(Landroid/support/v7/widget/GridLayoutManager;)V", "manager$delegate", "Lkotlin/properties/ReadWriteProperty;", "init", "", "onMeasure", "widthSpec", "heightSpec", "app_debug"})
public final class AutofitRecyclerView extends android.support.v7.widget.RecyclerView {
    private final kotlin.properties.ReadWriteProperty manager$delegate = null;
    private int columnWidth;
    
    private final android.support.v7.widget.GridLayoutManager getManager() {
        return null;
    }
    
    private final void setManager(android.support.v7.widget.GridLayoutManager p0) {
    }
    
    public final int getColumnWidth() {
        return 0;
    }
    
    public final void setColumnWidth(int p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthSpec, int heightSpec) {
    }
    
    public AutofitRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public AutofitRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public AutofitRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}