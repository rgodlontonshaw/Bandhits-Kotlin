package com.rklambo.bandhits.domain.interactor.event

import com.rklambo.bandhits.domain.entity.Artist
import com.rklambo.bandhits.domain.interactor.base.Event

data class ArtistsEvent(val artists: List<Artist>) : Event