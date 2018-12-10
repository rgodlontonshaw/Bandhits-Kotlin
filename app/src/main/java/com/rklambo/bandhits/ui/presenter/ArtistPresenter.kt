package com.rklambo.bandhits.ui.presenter

import com.rklambo.bandhits.domain.interactor.GetArtistDetailInteractor
import com.rklambo.bandhits.domain.interactor.GetTopAlbumsInteractor
import com.rklambo.bandhits.domain.interactor.base.Bus
import com.rklambo.bandhits.domain.interactor.base.InteractorExecutor
import com.rklambo.bandhits.domain.interactor.event.ArtistDetailEvent
import com.rklambo.bandhits.domain.interactor.event.TopAlbumsEvent
import com.rklambo.bandhits.ui.entity.ImageTitle
import com.rklambo.bandhits.ui.entity.mapper.ArtistDetailDataMapper
import com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper
import com.rklambo.bandhits.ui.view.ArtistView

open class ArtistPresenter(
    override val view: ArtistView,
    override val bus: Bus,
    private val artistDetailInteractor: GetArtistDetailInteractor,
    private val topAlbumsInteractor: GetTopAlbumsInteractor,
    private val interactorExecutor: InteractorExecutor,
    private val artistDetailMapper: ArtistDetailDataMapper,
    private val albumsMapper: ImageTitleDataMapper) : Presenter<ArtistView>, AlbumsPresenter {

    open fun init(artistId: String) {
        val artistDetailInteractor = artistDetailInteractor
        artistDetailInteractor.id = artistId
        interactorExecutor.execute(artistDetailInteractor)

        val topAlbumsInteractor = topAlbumsInteractor
        topAlbumsInteractor.artistId = artistId
        interactorExecutor.execute(this.topAlbumsInteractor)
    }

    fun onEvent(event: ArtistDetailEvent) {
        view.showArtist(artistDetailMapper.transform(event.artist))
    }

    fun onEvent(event: TopAlbumsEvent) {
        view.showAlbums(albumsMapper.transformAlbums(event.topAlbums))
    }

    override fun onAlbumClicked(item: ImageTitle) {
        view.navigateToAlbum(item.id)
    }
}