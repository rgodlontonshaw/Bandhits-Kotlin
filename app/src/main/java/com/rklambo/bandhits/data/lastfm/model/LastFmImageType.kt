package com.rklambo.bandhits.data.lastfm.model

enum class LastFmImageType(val type: String) {

    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large"),
    EXTRALARGE("extralarge"),
    MEGA("mega");

    fun findByName(name: String): LastFmImageType? {
        return values().firstOrNull { it.type == name }
    }
}