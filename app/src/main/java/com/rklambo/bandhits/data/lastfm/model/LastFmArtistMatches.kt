package com.rklambo.bandhits.data.lastfm.model

import com.google.gson.annotations.SerializedName

class LastFmArtistMatches (
        @SerializedName("artist") val artists: List<LastFmArtist>
)
