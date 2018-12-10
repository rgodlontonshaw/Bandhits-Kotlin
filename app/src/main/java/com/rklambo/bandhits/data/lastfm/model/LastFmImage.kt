package com.rklambo.bandhits.data.lastfm.model

import com.google.gson.annotations.SerializedName

class LastFmImage (
        @SerializedName("#text") val url: String,
        val size: String
)
