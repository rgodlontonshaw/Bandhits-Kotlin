// Generated by Dagger (https://google.github.io/dagger).
package com.rklambo.bandhits.di;

import com.rklambo.bandhits.data.lastfm.LastFmService;
import com.rklambo.bandhits.domain.repository.ArtistRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class RepositoryModule_ProvideArtistRepoFactory implements Factory<ArtistRepository> {
  private final RepositoryModule module;

  private final Provider<String> languageProvider;

  private final Provider<LastFmService> lastFmServiceProvider;

  public RepositoryModule_ProvideArtistRepoFactory(
      RepositoryModule module,
      Provider<String> languageProvider,
      Provider<LastFmService> lastFmServiceProvider) {
    this.module = module;
    this.languageProvider = languageProvider;
    this.lastFmServiceProvider = lastFmServiceProvider;
  }

  @Override
  public ArtistRepository get() {
    return Preconditions.checkNotNull(
        module.provideArtistRepo(languageProvider.get(), lastFmServiceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static RepositoryModule_ProvideArtistRepoFactory create(
      RepositoryModule module,
      Provider<String> languageProvider,
      Provider<LastFmService> lastFmServiceProvider) {
    return new RepositoryModule_ProvideArtistRepoFactory(
        module, languageProvider, lastFmServiceProvider);
  }

  public static ArtistRepository proxyProvideArtistRepo(
      RepositoryModule instance, String language, LastFmService lastFmService) {
    return Preconditions.checkNotNull(
        instance.provideArtistRepo(language, lastFmService),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
