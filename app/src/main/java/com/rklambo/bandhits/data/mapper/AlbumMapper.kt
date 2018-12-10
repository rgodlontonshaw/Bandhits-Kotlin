package com.rklambo.bandhits.data.mapper

import com.rklambo.bandhits.data.lastfm.model.LastFmAlbum
import com.rklambo.bandhits.data.lastfm.model.LastFmAlbumDetail
import com.rklambo.bandhits.domain.entity.Album
import com.rklambo.bandhits.domain.entity.Artist

class AlbumMapper(
    private val artistMapper: ArtistMapper = ArtistMapper(),
    private val imageMapper: ImageMapper = ImageMapper(),
    private val trackMapper: TrackMapper = TrackMapper()
) {

    fun transform(albums: List<LastFmAlbum>): List<Album> {
        return albums.filter { albumHasQualityInfo(it) }.mapNotNull { transform(it) }
    }

    private fun albumHasQualityInfo(album: LastFmAlbum): Boolean {
        return !isAlbumMbidEmpty(album) && album.images.isNotEmpty()
    }

    private fun isAlbumMbidEmpty(album: LastFmAlbum): Boolean {
        return album.mbid?.isEmpty() ?: true
    }

    fun transform(album: LastFmAlbumDetail) = album.mbid?.let {
        Album(
            album.mbid,
            album.name,
            Artist("", album.artist),
            imageMapper.getMainImageUrl(album.images),
            trackMapper.transform(album.tracks.tracks)
        )
    }

    fun transform(album: LastFmAlbum) = album.mbid?.let {
        Album(
            album.mbid,
            album.name,
            artistMapper.transform(album.artist),
            imageMapper.getMainImageUrl(album.images),
            trackMapper.transform(album.tracks?.tracks)
        )
    }
}