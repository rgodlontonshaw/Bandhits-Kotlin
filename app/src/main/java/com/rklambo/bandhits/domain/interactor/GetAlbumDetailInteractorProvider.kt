package com.rklambo.bandhits.domain.interactor

import com.rklambo.bandhits.domain.interactor.base.Event
import com.rklambo.bandhits.domain.interactor.base.Interactor
import com.rklambo.bandhits.domain.interactor.event.AlbumEvent
import com.rklambo.bandhits.domain.repository.AlbumRepository

class GetAlbumDetailInteractor(val albumRepository: AlbumRepository) : Interactor {

    var albumId: String? = null

    override fun invoke(): Event {
        val id = albumId ?: throw IllegalStateException("Album id should be specified")

        val album = albumRepository.getAlbum(id)
        return AlbumEvent(album)
    }

}