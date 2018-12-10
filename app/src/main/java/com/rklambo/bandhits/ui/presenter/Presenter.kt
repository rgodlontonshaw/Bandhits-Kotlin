package com.rklambo.bandhits.ui.presenter

import com.rklambo.bandhits.domain.interactor.base.Bus

interface Presenter<out T> {

    val view: T
    val bus: Bus

    fun onResume(){
        bus.register(this)
    }

    fun onPause(){
        bus.unregister(this)
    }
}