package com.rklambo.bandhits.ui.view

import com.rklambo.bandhits.ui.entity.AlbumDetail

interface AlbumView: PresentationView {
    fun showAlbum(albumDetail: AlbumDetail?)
}