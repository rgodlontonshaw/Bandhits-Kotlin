package com.rklambo.bandhits.ui.presenter

import com.rklambo.bandhits.domain.interactor.GetRecommendedArtistsInteractor
import com.rklambo.bandhits.domain.interactor.base.Bus
import com.rklambo.bandhits.domain.interactor.base.InteractorExecutor
import com.rklambo.bandhits.domain.interactor.event.ArtistsEvent
import com.rklambo.bandhits.ui.entity.ImageTitle
import com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper
import com.rklambo.bandhits.ui.view.MainView

class MainPresenter(
    override val view: MainView,
    override val bus: Bus,
    private val recommendedArtistsInteractor: GetRecommendedArtistsInteractor,
    private val interactorExecutor: InteractorExecutor,
    private val mapper: ImageTitleDataMapper
) : Presenter<MainView> {

    override fun onResume() {
        super.onResume()
        interactorExecutor.execute(recommendedArtistsInteractor)
    }

    fun onEvent(event: ArtistsEvent) {
        view.showArtists(mapper.transformArtists(event.artists))
    }

    fun onArtistClicked(item: ImageTitle) {
        view.navigateToDetail(item.id)
    }
}