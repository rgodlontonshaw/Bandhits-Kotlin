package com.rklambo.bandhits.ui.entity

data class ArtistDetail(val id: String,
                        val name: String,
                        val url: String? = null,
                        val bio: String? = null,
                        val albums: List<ImageTitle>? = null)