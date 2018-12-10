package com.rklambo.bandhits.domain.interactor.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;", "", "execute", "", "interactor", "Lcom/rklambo/bandhits/domain/interactor/base/Interactor;", "priority", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorPriority;", "app_debug"})
public abstract interface InteractorExecutor {
    
    public abstract void execute(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Interactor interactor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.InteractorPriority priority);
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}