package com.rklambo.bandhits.data.lastfm.model

import com.google.gson.annotations.SerializedName

class LastFmTracklist (
    @SerializedName("track") val tracks: List<LastFmTrack>
)