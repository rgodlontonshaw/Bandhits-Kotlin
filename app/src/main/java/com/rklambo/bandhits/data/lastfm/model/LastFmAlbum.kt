package com.rklambo.bandhits.data.lastfm.model

import com.google.gson.annotations.SerializedName

class LastFmAlbum(
        val name: String,
        val mbid: String?,
        val url: String,
        val artist: LastFmArtist,
        @SerializedName("image") val images: List<LastFmImage>,
        val tracks: LastFmTracklist?
)
