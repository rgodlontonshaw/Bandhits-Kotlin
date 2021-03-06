// Generated by Dagger (https://google.github.io/dagger).
package com.rklambo.bandhits.di.subcomponent.detail;

import com.rklambo.bandhits.ui.entity.mapper.ArtistDetailDataMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ArtistActivityModule_ProvideArtistDataMapperFactory
    implements Factory<ArtistDetailDataMapper> {
  private final ArtistActivityModule module;

  public ArtistActivityModule_ProvideArtistDataMapperFactory(ArtistActivityModule module) {
    this.module = module;
  }

  @Override
  public ArtistDetailDataMapper get() {
    return Preconditions.checkNotNull(
        module.provideArtistDataMapper(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ArtistActivityModule_ProvideArtistDataMapperFactory create(
      ArtistActivityModule module) {
    return new ArtistActivityModule_ProvideArtistDataMapperFactory(module);
  }

  public static ArtistDetailDataMapper proxyProvideArtistDataMapper(ArtistActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideArtistDataMapper(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
