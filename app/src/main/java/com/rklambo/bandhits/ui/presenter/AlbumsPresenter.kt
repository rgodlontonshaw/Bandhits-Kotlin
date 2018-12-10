package com.rklambo.bandhits.ui.presenter

import com.rklambo.bandhits.ui.entity.ImageTitle

interface AlbumsPresenter {
    fun onAlbumClicked(item: ImageTitle)
}