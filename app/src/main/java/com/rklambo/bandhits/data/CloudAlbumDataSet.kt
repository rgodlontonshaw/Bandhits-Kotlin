package com.rklambo.bandhits.data

import com.rklambo.bandhits.data.lastfm.LastFmService
import com.rklambo.bandhits.data.mapper.AlbumMapper
import com.rklambo.bandhits.domain.entity.Album
import com.rklambo.bandhits.repository.dataset.AlbumDataSet

class CloudAlbumDataSet(private val lastFmService: LastFmService) : AlbumDataSet {

    override fun requestAlbum(mbid: String): Album?
            = lastFmService.requestAlbum(mbid).unwrapCall { AlbumMapper().transform(album) }

    override fun requestTopAlbums(artistId: String?, artistName: String?): List<Album> {
        val mbid = artistId ?: ""
        val name = artistName ?: ""

        if (!mbid.isEmpty() || !name.isEmpty()) {
            return lastFmService.requestAlbums(mbid, name).unwrapCall {
                AlbumMapper().transform(topAlbums.albums)
            } ?: emptyList()
        }

        return emptyList()
    }
}
