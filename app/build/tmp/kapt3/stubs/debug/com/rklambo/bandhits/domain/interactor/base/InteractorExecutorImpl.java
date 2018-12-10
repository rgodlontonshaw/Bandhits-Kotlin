package com.rklambo.bandhits.domain.interactor.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutorImpl;", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;", "jobManager", "Lcom/birbit/android/jobqueue/JobManager;", "bus", "Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "(Lcom/birbit/android/jobqueue/JobManager;Lcom/rklambo/bandhits/domain/interactor/base/Bus;)V", "getBus", "()Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "execute", "", "interactor", "Lcom/rklambo/bandhits/domain/interactor/base/Interactor;", "priority", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorPriority;", "app_debug"})
public final class InteractorExecutorImpl implements com.rklambo.bandhits.domain.interactor.base.InteractorExecutor {
    private final com.birbit.android.jobqueue.JobManager jobManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.domain.interactor.base.Bus bus = null;
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Interactor interactor, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.InteractorPriority priority) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.domain.interactor.base.Bus getBus() {
        return null;
    }
    
    public InteractorExecutorImpl(@org.jetbrains.annotations.NotNull()
    com.birbit.android.jobqueue.JobManager jobManager, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Bus bus) {
        super();
    }
}