package com.rklambo.bandhits.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007J\u0012\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0007H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0010\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/rklambo/bandhits/di/ApplicationModule;", "", "app", "Lcom/rklambo/bandhits/App;", "(Lcom/rklambo/bandhits/App;)V", "provideApplication", "provideApplicationContext", "Landroid/content/Context;", "provideBus", "Lcom/rklambo/bandhits/domain/interactor/base/Bus;", "provideInteractorExecutor", "Lcom/rklambo/bandhits/domain/interactor/base/InteractorExecutor;", "jobManager", "Lcom/birbit/android/jobqueue/JobManager;", "bus", "provideJobManager", "context", "provideLanguageSelection", "", "providePicasso", "Lcom/squareup/picasso/Picasso;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private final com.rklambo.bandhits.App app = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rklambo.bandhits.App provideApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.qualifier.ApplicationQualifier()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideApplicationContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rklambo.bandhits.domain.interactor.base.Bus provideBus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.squareup.picasso.Picasso providePicasso(@org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.qualifier.ApplicationQualifier()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.birbit.android.jobqueue.JobManager provideJobManager(@org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.qualifier.ApplicationQualifier()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rklambo.bandhits.domain.interactor.base.InteractorExecutor provideInteractorExecutor(@org.jetbrains.annotations.NotNull()
    com.birbit.android.jobqueue.JobManager jobManager, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.domain.interactor.base.Bus bus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.qualifier.LanguageSelection()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.lang.String provideLanguageSelection() {
        return null;
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.App app) {
        super();
    }
}