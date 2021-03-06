// Generated by Dagger (https://google.github.io/dagger).
package com.rklambo.bandhits.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class DataModule_ProvideRestAdapterFactory implements Factory<Retrofit> {
  private final DataModule module;

  private final Provider<OkHttpClient> clientProvider;

  public DataModule_ProvideRestAdapterFactory(
      DataModule module, Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRestAdapter(clientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DataModule_ProvideRestAdapterFactory create(
      DataModule module, Provider<OkHttpClient> clientProvider) {
    return new DataModule_ProvideRestAdapterFactory(module, clientProvider);
  }

  public static Retrofit proxyProvideRestAdapter(DataModule instance, OkHttpClient client) {
    return Preconditions.checkNotNull(
        instance.provideRestAdapter(client),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
