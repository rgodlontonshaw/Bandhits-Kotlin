package com.rklambo.bandhits.domain.entity

data class Artist(
        val id: String,
        val name: String,
        val url: String? = null,
        val bio: String? = null,
        val albums: List<Album>? = null)