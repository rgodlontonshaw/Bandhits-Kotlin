package com.rklambo.bandhits.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rklambo.bandhits.App
import com.rklambo.bandhits.di.ApplicationComponent
import org.jetbrains.anko.setContentView

abstract class BaseActivity<out UI : ActivityAnkoComponent<out AppCompatActivity>> : AppCompatActivity() {

    companion object {
        const val IMAGE_TRANSITION_NAME = "activity_image_transition"
    }

    abstract val ui: UI

    @Suppress("UNCHECKED_CAST")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependencies(App.graph)
        (ui as ActivityAnkoComponent<AppCompatActivity>).setContentView(this)
        setSupportActionBar(ui.toolbar)
    }

    abstract fun injectDependencies(applicationComponent: ApplicationComponent)
}