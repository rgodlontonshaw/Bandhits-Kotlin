package com.rklambo.bandhits.data.lastfm.model

import com.google.gson.annotations.SerializedName

class LastFmSimilar (
    @SerializedName("artist") var artists: List<LastFmArtist>
)
