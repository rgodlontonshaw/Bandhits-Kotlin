// Generated by Dagger (https://google.github.io/dagger).
package com.rklambo.bandhits.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ActivityModule_ProvideActiviyContextFactory implements Factory<Context> {
  private final ActivityModule module;

  public ActivityModule_ProvideActiviyContextFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideActiviyContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideActiviyContextFactory create(ActivityModule module) {
    return new ActivityModule_ProvideActiviyContextFactory(module);
  }

  public static Context proxyProvideActiviyContext(ActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideActiviyContext(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
