package com.rklambo.bandhits.ui.fragment

import com.rklambo.bandhits.ui.presenter.AlbumsPresenter

interface AlbumsFragmentContainer {
    fun getAlbumsPresenter(): AlbumsPresenter
}