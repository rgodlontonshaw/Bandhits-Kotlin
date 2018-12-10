package com.rklambo.bandhits.domain.repository

import com.rklambo.bandhits.domain.entity.Artist

interface ArtistRepository {
    fun getRecommendedArtists(): List<Artist>
    fun getArtist(id: String): Artist
}