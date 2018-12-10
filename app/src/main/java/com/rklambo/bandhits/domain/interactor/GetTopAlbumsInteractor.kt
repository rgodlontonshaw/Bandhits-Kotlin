package com.rklambo.bandhits.domain.interactor

import com.rklambo.bandhits.domain.interactor.base.Event
import com.rklambo.bandhits.domain.interactor.base.Interactor
import com.rklambo.bandhits.domain.interactor.event.TopAlbumsEvent
import com.rklambo.bandhits.domain.repository.AlbumRepository

class GetTopAlbumsInteractor(val albumRepository: AlbumRepository) : Interactor {

    var artistId: String? = null
    var artistName: String? = null

    override fun invoke(): Event {
        if (artistId == null && artistName == null) {
            throw IllegalStateException("Either mbid or name should be specified")
        }
        val albums = albumRepository.getTopAlbums(artistId, artistName)
        return TopAlbumsEvent(albums)
    }
}