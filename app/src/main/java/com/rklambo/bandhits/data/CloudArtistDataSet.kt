package com.rklambo.bandhits.data

import com.rklambo.bandhits.data.lastfm.LastFmService
import com.rklambo.bandhits.data.mapper.ArtistMapper
import com.rklambo.bandhits.domain.entity.Artist
import com.rklambo.bandhits.repository.dataset.ArtistDataSet

class CloudArtistDataSet(val language: String, private val lastFmService: LastFmService) :
    ArtistDataSet {

    val coldplayMbid = "cc197bad-dc9c-440d-a5b5-d52ba2e14234"

    override fun requestRecommendedArtists(): List<Artist> =
        lastFmService.requestSimilar(coldplayMbid).unwrapCall {
            // Search for coldplay similar artists.
            ArtistMapper().transform(similarArtists.artists)
        } ?: emptyList()

    override fun requestArtist(id: String): Artist? =
        lastFmService.requestArtistInfo(id, language).unwrapCall {
            return ArtistMapper().transform(artist)
        }
}