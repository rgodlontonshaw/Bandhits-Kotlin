// Generated by Dagger (https://google.github.io/dagger).
package com.rklambo.bandhits.di;

import com.rklambo.bandhits.domain.interactor.GetTopAlbumsInteractor;
import com.rklambo.bandhits.domain.repository.AlbumRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DomainModule_ProvideTopAlbumsInteractorFactory
    implements Factory<GetTopAlbumsInteractor> {
  private final DomainModule module;

  private final Provider<AlbumRepository> albumRepositoryProvider;

  public DomainModule_ProvideTopAlbumsInteractorFactory(
      DomainModule module, Provider<AlbumRepository> albumRepositoryProvider) {
    this.module = module;
    this.albumRepositoryProvider = albumRepositoryProvider;
  }

  @Override
  public GetTopAlbumsInteractor get() {
    return Preconditions.checkNotNull(
        module.provideTopAlbumsInteractor(albumRepositoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DomainModule_ProvideTopAlbumsInteractorFactory create(
      DomainModule module, Provider<AlbumRepository> albumRepositoryProvider) {
    return new DomainModule_ProvideTopAlbumsInteractorFactory(module, albumRepositoryProvider);
  }

  public static GetTopAlbumsInteractor proxyProvideTopAlbumsInteractor(
      DomainModule instance, AlbumRepository albumRepository) {
    return Preconditions.checkNotNull(
        instance.provideTopAlbumsInteractor(albumRepository),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}