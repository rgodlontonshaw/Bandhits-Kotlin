package com.rklambo.bandhits.data.lastfm.model

class LastFmTrack (
    val name: String,
    val duration: Int = 0,
    val mbid: String?,
    val url: String?,
    val artist: LastFmArtist
)
