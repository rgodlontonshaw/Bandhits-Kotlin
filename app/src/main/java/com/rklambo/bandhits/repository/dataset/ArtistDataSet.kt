package com.rklambo.bandhits.repository.dataset

import com.rklambo.bandhits.domain.entity.Artist

interface ArtistDataSet {

    fun requestRecommendedArtists(): List<Artist>
    fun requestArtist(id: String): Artist?
}