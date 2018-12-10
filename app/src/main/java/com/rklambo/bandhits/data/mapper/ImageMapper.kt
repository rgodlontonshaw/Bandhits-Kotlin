package com.rklambo.bandhits.data.mapper

import com.rklambo.bandhits.data.lastfm.model.LastFmImage
import com.rklambo.bandhits.data.lastfm.model.LastFmImageType

class ImageMapper {
    fun getMainImageUrl(images: List<LastFmImage>?): String? {
        if (images == null || images.isEmpty()) {
            return null
        }

        val image = images.firstOrNull { it.size == LastFmImageType.MEGA.type }
        return image?.url ?: images.last().url
    }
}