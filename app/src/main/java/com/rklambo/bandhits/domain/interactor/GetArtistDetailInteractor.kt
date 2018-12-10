package com.rklambo.bandhits.domain.interactor

import com.rklambo.bandhits.domain.interactor.base.Event
import com.rklambo.bandhits.domain.interactor.base.Interactor
import com.rklambo.bandhits.domain.interactor.event.ArtistDetailEvent
import com.rklambo.bandhits.domain.repository.ArtistRepository

class GetArtistDetailInteractor(private val artistRepository: ArtistRepository) : Interactor {

    var id: String? = null

    override fun invoke(): Event {
        val id = this.id ?: throw IllegalStateException("id can´t be null")
        val artist = artistRepository.getArtist(id)
        return ArtistDetailEvent(artist)
    }
}