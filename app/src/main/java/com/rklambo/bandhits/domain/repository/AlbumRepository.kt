package com.rklambo.bandhits.domain.repository

import com.rklambo.bandhits.domain.entity.Album

interface AlbumRepository {
    fun getTopAlbums(artistId: String?, artistName: String?): List<Album>
    fun getAlbum(id: String): Album?
}