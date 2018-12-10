package com.rklambo.bandhits.di.subcomponent.detail

import com.rklambo.bandhits.di.scope.ActivityScope
import com.rklambo.bandhits.ui.screens.detail.ArtistActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [(ArtistActivityModule::class)])
interface ArtistActivityComponent {

    fun injectTo(activity: ArtistActivity)
}