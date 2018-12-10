package com.rklambo.bandhits.repository.dataset

import com.rklambo.bandhits.domain.entity.Album

interface AlbumDataSet {

    fun requestTopAlbums(artistId: String?, artistName: String?): List<Album>
    fun requestAlbum(mbid: String): Album?

}