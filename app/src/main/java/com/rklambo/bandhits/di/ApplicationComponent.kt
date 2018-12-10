package com.rklambo.bandhits.di

import com.rklambo.bandhits.di.subcomponent.album.AlbumActivityComponent
import com.rklambo.bandhits.di.subcomponent.album.AlbumActivityModule
import com.rklambo.bandhits.di.subcomponent.detail.ArtistActivityComponent
import com.rklambo.bandhits.di.subcomponent.detail.ArtistActivityModule
import com.rklambo.bandhits.di.subcomponent.main.MainActivityComponent
import com.rklambo.bandhits.di.subcomponent.main.MainActivityModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [(ApplicationModule::class), (DataModule::class), (RepositoryModule::class),
        (DomainModule::class)]
)
interface ApplicationComponent {

    fun plus(module: MainActivityModule): MainActivityComponent
    fun plus(module: ArtistActivityModule): ArtistActivityComponent
    fun plus(module: AlbumActivityModule): AlbumActivityComponent
}