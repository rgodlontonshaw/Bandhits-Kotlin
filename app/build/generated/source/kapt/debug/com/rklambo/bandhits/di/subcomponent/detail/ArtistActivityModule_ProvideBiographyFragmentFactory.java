// Generated by Dagger (https://google.github.io/dagger).
package com.rklambo.bandhits.di.subcomponent.detail;

import com.rklambo.bandhits.ui.screens.detail.BiographyFragment;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ArtistActivityModule_ProvideBiographyFragmentFactory
    implements Factory<BiographyFragment> {
  private final ArtistActivityModule module;

  public ArtistActivityModule_ProvideBiographyFragmentFactory(ArtistActivityModule module) {
    this.module = module;
  }

  @Override
  public BiographyFragment get() {
    return Preconditions.checkNotNull(
        module.provideBiographyFragment(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ArtistActivityModule_ProvideBiographyFragmentFactory create(
      ArtistActivityModule module) {
    return new ArtistActivityModule_ProvideBiographyFragmentFactory(module);
  }

  public static BiographyFragment proxyProvideBiographyFragment(ArtistActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideBiographyFragment(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}