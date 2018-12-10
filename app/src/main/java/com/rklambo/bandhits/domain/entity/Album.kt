package com.rklambo.bandhits.domain.entity

data class Album(val id: String, val name: String, val artist: Artist? = null, val url: String? = null, val tracks: List<Track> = emptyList())