package com.rklambo.bandhits.di.subcomponent.album

import com.rklambo.bandhits.di.scope.ActivityScope
import com.rklambo.bandhits.ui.screens.album.AlbumActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [(AlbumActivityModule::class)])
interface AlbumActivityComponent {
    fun injectTo(activity: AlbumActivity)
}