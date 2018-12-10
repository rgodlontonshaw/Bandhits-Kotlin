package com.rklambo.bandhits.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005:\u0001\'B\u001b\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u001e\u0010\u001e\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010 \u001a\u00020\u001dH\u0016J\u0015\u0010!\u001a\u00028\u00012\u0006\u0010\"\u001a\u00020\u0004H&\u00a2\u0006\u0002\u0010#J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\"\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001dH\u0016R8\u0010\u000b\u001a(\u0012\u0004\u0012\u00028\u0001\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\u0002\b\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/rklambo/bandhits/ui/adapter/BaseAdapter;", "Item", "Component", "Lcom/rklambo/bandhits/ui/activity/ViewAnkoComponent;", "Landroid/support/v7/widget/RecyclerView;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/rklambo/bandhits/ui/adapter/BaseAdapter$BaseViewHolder;", "listener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "bind", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "Lkotlin/ExtensionFunctionType;", "getBind", "()Lkotlin/jvm/functions/Function2;", "<set-?>", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items$delegate", "Lkotlin/properties/ReadWriteProperty;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateComponent", "parent", "(Landroid/support/v7/widget/RecyclerView;)Lcom/rklambo/bandhits/ui/activity/ViewAnkoComponent;", "onCreateViewHolder", "Landroid/view/ViewGroup;", "viewType", "BaseViewHolder", "app_debug"})
public abstract class BaseAdapter<Item extends java.lang.Object, Component extends com.rklambo.bandhits.ui.activity.ViewAnkoComponent<android.support.v7.widget.RecyclerView>> extends android.support.v7.widget.RecyclerView.Adapter<com.rklambo.bandhits.ui.adapter.BaseAdapter.BaseViewHolder<? extends Component>> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty items$delegate = null;
    private final kotlin.jvm.functions.Function1<Item, kotlin.Unit> listener = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function2<Component, Item, kotlin.Unit> getBind();
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<Item> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Item> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract Component onCreateComponent(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView parent);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rklambo.bandhits.ui.adapter.BaseAdapter.BaseViewHolder<Component> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.ui.adapter.BaseAdapter.BaseViewHolder<? extends Component> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super Item, kotlin.Unit> listener) {
        super();
    }
    
    public BaseAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0010\b\u0002\u0010\u0001 \u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/rklambo/bandhits/ui/adapter/BaseAdapter$BaseViewHolder;", "Component", "Lcom/rklambo/bandhits/ui/activity/ViewAnkoComponent;", "Landroid/support/v7/widget/RecyclerView;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "ui", "(Lcom/rklambo/bandhits/ui/activity/ViewAnkoComponent;)V", "getUi", "()Lcom/rklambo/bandhits/ui/activity/ViewAnkoComponent;", "Lcom/rklambo/bandhits/ui/activity/ViewAnkoComponent;", "app_debug"})
    public static final class BaseViewHolder<Component extends com.rklambo.bandhits.ui.activity.ViewAnkoComponent<android.support.v7.widget.RecyclerView>> extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final Component ui = null;
        
        @org.jetbrains.annotations.NotNull()
        public final Component getUi() {
            return null;
        }
        
        public BaseViewHolder(@org.jetbrains.annotations.NotNull()
        Component ui) {
            super(null);
        }
    }
}