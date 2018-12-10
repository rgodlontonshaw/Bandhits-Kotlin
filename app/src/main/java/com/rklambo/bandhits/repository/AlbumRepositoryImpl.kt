package com.rklambo.bandhits.repository

import com.rklambo.bandhits.domain.repository.AlbumRepository
import com.rklambo.bandhits.repository.dataset.AlbumDataSet

class AlbumRepositoryImpl(private val albumDataSets: List<AlbumDataSet>) : AlbumRepository {

    override fun getAlbum(id: String) = albumDataSets
            .map { it.requestAlbum(id) }
            .firstOrNull { it != null }

    override fun getTopAlbums(artistId: String?, artistName: String?) = albumDataSets
                .map { it.requestTopAlbums(artistId, artistName) }
                .firstOrNull { it.isNotEmpty() }
                ?: emptyList()
}