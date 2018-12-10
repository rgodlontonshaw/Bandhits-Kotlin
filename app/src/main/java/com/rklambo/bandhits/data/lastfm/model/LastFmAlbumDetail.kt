package com.rklambo.bandhits.data.lastfm.model

import com.google.gson.annotations.SerializedName

class LastFmAlbumDetail(
        val name: String,
        val mbid: String?,
        val url: String,
        val artist: String,
        @SerializedName("releasedate") val releaseDate: String,
        @SerializedName("image") val images: List<LastFmImage>,
        val tracks: LastFmTracklist
)
