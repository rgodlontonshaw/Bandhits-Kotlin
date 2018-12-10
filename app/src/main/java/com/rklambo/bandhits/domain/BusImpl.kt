package com.rklambo.bandhits.domain

import android.os.Handler
import android.os.Looper
import com.rklambo.bandhits.domain.interactor.base.Bus
import de.greenrobot.event.EventBus

class BusImpl : EventBus(), Bus {

    private val mainThread = Handler(Looper.getMainLooper())

    override fun post(event: Any) {
        mainThread.post({ super.post(event) })
    }
}