package com.rklambo.bandhits.data.mapper

import com.rklambo.bandhits.data.lastfm.model.LastFmTrack
import com.rklambo.bandhits.domain.entity.Track

class TrackMapper {

    fun transform(tracks: List<LastFmTrack>?) : List<Track> = tracks?.map { transform(it) } ?: emptyList()
    fun transform(track: LastFmTrack) = Track(track.name, track.duration)
}