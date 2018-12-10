package com.rklambo.bandhits.ui.presenter

import com.rklambo.bandhits.domain.interactor.GetAlbumDetailInteractor
import com.rklambo.bandhits.domain.interactor.base.Bus
import com.rklambo.bandhits.domain.interactor.base.InteractorExecutor
import com.rklambo.bandhits.domain.interactor.event.AlbumEvent
import com.rklambo.bandhits.ui.entity.mapper.AlbumDetailDataMapper
import com.rklambo.bandhits.ui.view.AlbumView

open class AlbumPresenter(
    override val view: AlbumView,
    override val bus: Bus,
    private val albumInteractor: GetAlbumDetailInteractor,
    private val interactorExecutor: InteractorExecutor,
    private val albumDetailMapper: AlbumDetailDataMapper) : Presenter<AlbumView> {

    open fun init(albumId: String) {
        val albumDetailInteractor = albumInteractor
        albumInteractor.albumId = albumId
        interactorExecutor.execute(albumDetailInteractor)
    }

    fun onEvent(event: AlbumEvent) {
        view.showAlbum(albumDetailMapper.transform(event.album))
    }
}