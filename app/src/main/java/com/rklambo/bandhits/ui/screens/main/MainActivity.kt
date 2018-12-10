package com.rklambo.bandhits.ui.screens.main

import android.os.Bundle
import android.view.View
import com.rklambo.bandhits.di.ApplicationComponent
import com.rklambo.bandhits.di.subcomponent.main.MainActivityModule
import com.rklambo.bandhits.ui.activity.BaseActivity
import com.rklambo.bandhits.ui.adapter.BaseAdapter
import com.rklambo.bandhits.ui.adapter.ImageTitleAdapter
import com.rklambo.bandhits.ui.entity.ImageTitle
import com.rklambo.bandhits.ui.presenter.MainPresenter
import com.rklambo.bandhits.ui.screens.detail.ArtistActivity
import com.rklambo.bandhits.ui.util.navigate
import com.rklambo.bandhits.ui.view.MainView
import javax.inject.Inject

class MainActivity : BaseActivity<MainLayout>(), MainView {

    override val ui = MainLayout()

    @Inject
    lateinit var presenter: MainPresenter

    val adapter = ImageTitleAdapter { presenter.onArtistClicked(it) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui.recycler.adapter = adapter
    }

    override fun injectDependencies(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(MainActivityModule(this))
                .injectTo(this)
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    override fun showArtists(artists: List<ImageTitle>) {
        adapter.items = artists
    }

    override fun navigateToDetail(id: String) {
        navigate<ArtistActivity>(id, findItemById(id), BaseActivity.IMAGE_TRANSITION_NAME)
    }

    private fun findItemById(id: String): View {
        val pos = adapter.findPositionById(id)
        val holder = ui.recycler.findViewHolderForLayoutPosition(pos) as BaseAdapter.BaseViewHolder<ImageTitleAdapter.Component>
        return holder.ui.image
    }
}