package com.rklambo.bandhits.data.lastfm.model

import com.google.gson.annotations.SerializedName

class LastFmResult (
        @SerializedName("artistmatches") val artistMatches: LastFmArtistMatches
)
