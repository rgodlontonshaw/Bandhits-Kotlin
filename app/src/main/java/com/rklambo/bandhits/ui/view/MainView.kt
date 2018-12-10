package com.rklambo.bandhits.ui.view

import com.rklambo.bandhits.ui.entity.ImageTitle

interface MainView : PresentationView {
    fun showArtists(artists: List<ImageTitle>)
    fun navigateToDetail(id: String)
}