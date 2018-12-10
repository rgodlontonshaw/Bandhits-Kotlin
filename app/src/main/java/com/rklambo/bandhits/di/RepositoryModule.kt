package com.rklambo.bandhits.di

import com.rklambo.bandhits.data.CloudAlbumDataSet
import com.rklambo.bandhits.data.CloudArtistDataSet
import com.rklambo.bandhits.data.lastfm.LastFmService
import com.rklambo.bandhits.di.qualifier.LanguageSelection
import com.rklambo.bandhits.domain.repository.AlbumRepository
import com.rklambo.bandhits.domain.repository.ArtistRepository
import com.rklambo.bandhits.repository.AlbumRepositoryImpl
import com.rklambo.bandhits.repository.ArtistRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides @Singleton
    fun provideArtistRepo(@LanguageSelection language: String, lastFmService: LastFmService): ArtistRepository
            = ArtistRepositoryImpl(listOf(CloudArtistDataSet(language, lastFmService)))

    @Provides @Singleton
    fun provideAlbumRepo(lastFmService: LastFmService): AlbumRepository
            = AlbumRepositoryImpl(listOf(CloudAlbumDataSet(lastFmService)))
}