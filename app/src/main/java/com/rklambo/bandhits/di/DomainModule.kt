package com.rklambo.bandhits.di

import com.rklambo.bandhits.domain.interactor.GetAlbumDetailInteractor
import com.rklambo.bandhits.domain.interactor.GetArtistDetailInteractor
import com.rklambo.bandhits.domain.interactor.GetRecommendedArtistsInteractor
import com.rklambo.bandhits.domain.interactor.GetTopAlbumsInteractor
import com.rklambo.bandhits.domain.repository.AlbumRepository
import com.rklambo.bandhits.domain.repository.ArtistRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRecommendedArtistsInteractor(artistRepository: ArtistRepository)
            = GetRecommendedArtistsInteractor(artistRepository)

    @Provides
    fun provideArtistDetailInteractor(artistRepository: ArtistRepository)
            = GetArtistDetailInteractor(artistRepository)

    @Provides
    fun provideTopAlbumsInteractor(albumRepository: AlbumRepository)
            = GetTopAlbumsInteractor(albumRepository)

    @Provides
    fun provideAlbumsDetailInteractor(albumRepository: AlbumRepository)
            = GetAlbumDetailInteractor(albumRepository)
}