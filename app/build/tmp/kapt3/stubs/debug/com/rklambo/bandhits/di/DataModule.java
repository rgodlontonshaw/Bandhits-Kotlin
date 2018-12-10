package com.rklambo.bandhits.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001c\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\nH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/rklambo/bandhits/di/DataModule;", "", "()V", "provideApiKey", "", "context", "Landroid/content/Context;", "provideCache", "Lokhttp3/Cache;", "provideCacheDuration", "", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "cache", "interceptor", "Lcom/rklambo/bandhits/data/lastfm/LastFmRequestInterceptor;", "provideRequestInterceptor", "apiKey", "cacheDuration", "provideRestAdapter", "Lretrofit2/Retrofit;", "client", "providesLastFmService", "Lcom/rklambo/bandhits/data/lastfm/LastFmService;", "retrofit", "app_debug"})
@dagger.Module()
public final class DataModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Cache provideCache(@org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.qualifier.ApplicationQualifier()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.qualifier.ApiKey()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.lang.String provideApiKey(@org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.qualifier.ApplicationQualifier()
    android.content.Context context) {
        return null;
    }
    
    @com.rklambo.bandhits.di.qualifier.CacheDuration()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final int provideCacheDuration(@org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.qualifier.ApplicationQualifier()
    android.content.Context context) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.LastFmRequestInterceptor interceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rklambo.bandhits.data.lastfm.LastFmRequestInterceptor provideRequestInterceptor(@org.jetbrains.annotations.NotNull()
    @com.rklambo.bandhits.di.qualifier.ApiKey()
    java.lang.String apiKey, @com.rklambo.bandhits.di.qualifier.CacheDuration()
    int cacheDuration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRestAdapter(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rklambo.bandhits.data.lastfm.LastFmService providesLastFmService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public DataModule() {
        super();
    }
}