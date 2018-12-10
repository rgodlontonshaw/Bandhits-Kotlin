package com.rklambo.bandhits.domain.interactor.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H&\u00a8\u0006\b"}, d2 = {"Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "", "post", "", "event", "register", "observer", "unregister", "app_debug"})
public abstract interface Bus {
    
    public abstract void post(@org.jetbrains.annotations.NotNull()
    java.lang.Object event);
    
    public abstract void register(@org.jetbrains.annotations.NotNull()
    java.lang.Object observer);
    
    public abstract void unregister(@org.jetbrains.annotations.NotNull()
    java.lang.Object observer);
}