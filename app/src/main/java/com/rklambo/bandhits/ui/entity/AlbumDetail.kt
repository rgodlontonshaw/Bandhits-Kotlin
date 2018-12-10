package com.rklambo.bandhits.ui.entity

import com.rklambo.bandhits.domain.entity.Track

data class AlbumDetail(val id: String,
                       val name: String,
                       val url: String? = null,
                       val tracks: List<Track> = emptyList())