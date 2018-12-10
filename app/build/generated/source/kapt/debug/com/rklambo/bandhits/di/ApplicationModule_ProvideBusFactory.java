// Generated by Dagger (https://google.github.io/dagger).
package com.rklambo.bandhits.di;

import com.rklambo.bandhits.domain.interactor.base.Bus;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApplicationModule_ProvideBusFactory implements Factory<Bus> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideBusFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Bus get() {
    return Preconditions.checkNotNull(
        module.provideBus(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvideBusFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideBusFactory(module);
  }

  public static Bus proxyProvideBus(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideBus(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
