package com.rklambo.bandhits.domain.interactor.event

import com.rklambo.bandhits.domain.entity.Album
import com.rklambo.bandhits.domain.interactor.base.Event

data class TopAlbumsEvent(val topAlbums: List<Album>) : Event