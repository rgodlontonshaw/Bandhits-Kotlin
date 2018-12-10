// Generated by Dagger (https://google.github.io/dagger).
package com.rklambo.bandhits.di;

import android.content.Context;
import com.birbit.android.jobqueue.JobManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class ApplicationModule_ProvideJobManagerFactory implements Factory<JobManager> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvideJobManagerFactory(
      ApplicationModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public JobManager get() {
    return Preconditions.checkNotNull(
        module.provideJobManager(contextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvideJobManagerFactory create(
      ApplicationModule module, Provider<Context> contextProvider) {
    return new ApplicationModule_ProvideJobManagerFactory(module, contextProvider);
  }

  public static JobManager proxyProvideJobManager(ApplicationModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.provideJobManager(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}