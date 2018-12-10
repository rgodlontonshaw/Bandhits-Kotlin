package com.rklambo.bandhits.domain.interactor.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0016J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/rklambo/bandhits/domain/interactor/base/InteractorWrapper;", "Lcom/birbit/android/jobqueue/Job;", "interactor", "Lcom/rklambo/bandhits/domain/interactor/base/Interactor;", "priority", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorPriority;", "bus", "Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "(Lcom/rklambo/bandhits/domain/interactor/base/Interactor;Lcom/rklambo/bandhits/domain/interactor/base/InteractorPriority;Lcom/rklambo/bandhits/domain/interactor/base/Bus;)V", "getBus", "()Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "getInteractor", "()Lcom/rklambo/bandhits/domain/interactor/base/Interactor;", "onAdded", "", "onCancel", "p0", "", "p1", "", "onRun", "shouldReRunOnThrowable", "Lcom/birbit/android/jobqueue/RetryConstraint;", "p2", "app_debug"})
public final class InteractorWrapper extends com.birbit.android.jobqueue.Job {
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.domain.interactor.base.Interactor interactor = null;
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.domain.interactor.base.Bus bus = null;
    
    @java.lang.Override()
    public void onRun() {
    }
    
    @java.lang.Override()
    public void onAdded() {
    }
    
    @java.lang.Override()
    protected void onCancel(int p0, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable p1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.birbit.android.jobqueue.RetryConstraint shouldReRunOnThrowable(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable p0, int p1, int p2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.domain.interactor.base.Interactor getInteractor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.domain.interactor.base.Bus getBus() {
        return null;
    }
    
    public InteractorWrapper(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Interactor interactor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.InteractorPriority priority, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Bus bus) {
        super(null);
    }
}