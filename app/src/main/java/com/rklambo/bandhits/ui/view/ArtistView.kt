package com.rklambo.bandhits.ui.view

import com.rklambo.bandhits.ui.entity.ArtistDetail
import com.rklambo.bandhits.ui.entity.ImageTitle

interface ArtistView : PresentationView {
    fun showArtist(artistDetail: ArtistDetail)

    fun showAlbums(albums: List<ImageTitle>)

    fun navigateToAlbum(albumId: String)
}