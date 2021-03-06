// Generated by Dagger (https://google.github.io/dagger).
package com.rklambo.bandhits.di;

import com.rklambo.bandhits.App;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApplicationModule_ProvideApplicationFactory implements Factory<App> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideApplicationFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public App get() {
    return Preconditions.checkNotNull(
        module.provideApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvideApplicationFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideApplicationFactory(module);
  }

  public static App proxyProvideApplication(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
