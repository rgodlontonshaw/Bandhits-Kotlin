// Generated by Dagger (https://google.github.io/dagger).
package com.rklambo.bandhits.di;

import android.content.Context;
import com.squareup.picasso.Picasso;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class ApplicationModule_ProvidePicassoFactory implements Factory<Picasso> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvidePicassoFactory(
      ApplicationModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public Picasso get() {
    return Preconditions.checkNotNull(
        module.providePicasso(contextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvidePicassoFactory create(
      ApplicationModule module, Provider<Context> contextProvider) {
    return new ApplicationModule_ProvidePicassoFactory(module, contextProvider);
  }

  public static Picasso proxyProvidePicasso(ApplicationModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.providePicasso(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
