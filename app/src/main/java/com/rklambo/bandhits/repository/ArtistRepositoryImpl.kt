package com.rklambo.bandhits.repository

import com.rklambo.bandhits.domain.entity.Artist
import com.rklambo.bandhits.domain.repository.ArtistRepository
import com.rklambo.bandhits.repository.dataset.ArtistDataSet

class ArtistRepositoryImpl(private val artistDataSets: List<ArtistDataSet>) : ArtistRepository {

    override fun getRecommendedArtists() = artistDataSets
            .map { it.requestRecommendedArtists() }
            .firstOrNull { it.isNotEmpty() }
            .orEmpty()

    override fun getArtist(id: String): Artist = artistDataSets
            .map { it.requestArtist(id) }
            .firstOrNull { it != null }
            ?: Artist("empty", "empty", "empty")

}