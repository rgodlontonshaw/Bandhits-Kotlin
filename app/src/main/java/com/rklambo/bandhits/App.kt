
package com.rklambo.bandhits

import android.app.Application
import com.rklambo.bandhits.di.ApplicationComponent
import com.rklambo.bandhits.di.ApplicationModule
import com.rklambo.bandhits.di.DaggerApplicationComponent

class App : Application() {

    companion object {
        lateinit var graph: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    private fun initializeDagger() {
        graph = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

