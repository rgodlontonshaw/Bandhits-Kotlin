package com.rklambo.bandhits.domain.interactor

import com.rklambo.bandhits.domain.interactor.base.Event
import com.rklambo.bandhits.domain.interactor.base.Interactor
import com.rklambo.bandhits.domain.interactor.event.ArtistsEvent
import com.rklambo.bandhits.domain.repository.ArtistRepository

class GetRecommendedArtistsInteractor(private val artistRepository: ArtistRepository) : Interactor {

    override fun invoke(): Event {
        val artists = artistRepository.getRecommendedArtists()
        return ArtistsEvent(artists)
    }
}