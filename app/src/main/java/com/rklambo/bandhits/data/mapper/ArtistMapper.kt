package com.rklambo.bandhits.data.mapper

import com.rklambo.bandhits.data.lastfm.model.LastFmArtist
import com.rklambo.bandhits.domain.entity.Artist

class ArtistMapper(private val imageMapper: ImageMapper = ImageMapper()) {

    fun transform(artists: List<LastFmArtist>): List<Artist> {
        return artists.filter { artistHasQualityInfo(it) }.mapNotNull { transform(it) }
    }

    fun transform(artist: LastFmArtist) = artist.mbid?.let {
        Artist(artist.mbid, artist.name, imageMapper.getMainImageUrl(artist.images), artist.bio?.content)
    }

    private fun artistHasQualityInfo(it: LastFmArtist): Boolean {
        return !isArtistMbidEmpty(it) && it.images != null && it.images.isNotEmpty()
    }

    private fun isArtistMbidEmpty(artist: LastFmArtist): Boolean {
        return artist.mbid?.isEmpty() ?: true
    }
}