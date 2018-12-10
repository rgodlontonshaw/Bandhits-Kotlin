package com.rklambo.bandhits.di.subcomponent.main

import com.rklambo.bandhits.di.scope.ActivityScope
import com.rklambo.bandhits.ui.screens.main.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [(MainActivityModule::class)])
interface MainActivityComponent {

    fun injectTo(activity: MainActivity)
}