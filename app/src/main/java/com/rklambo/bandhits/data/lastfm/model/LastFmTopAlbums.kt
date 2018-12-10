package com.rklambo.bandhits.data.lastfm.model

import com.google.gson.annotations.SerializedName

class LastFmTopAlbums (
        @SerializedName("album") val albums: List<LastFmAlbum>
)
