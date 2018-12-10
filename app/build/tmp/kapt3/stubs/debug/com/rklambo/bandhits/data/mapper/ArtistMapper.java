package com.rklambo.bandhits.data.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\bJ\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/rklambo/bandhits/data/mapper/ArtistMapper;", "", "imageMapper", "Lcom/rklambo/bandhits/data/mapper/ImageMapper;", "(Lcom/rklambo/bandhits/data/mapper/ImageMapper;)V", "artistHasQualityInfo", "", "it", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmArtist;", "isArtistMbidEmpty", "artist", "transform", "Lcom/rklambo/bandhits/domain/entity/Artist;", "", "artists", "app_debug"})
public final class ArtistMapper {
    private final com.rklambo.bandhits.data.mapper.ImageMapper imageMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.rklambo.bandhits.domain.entity.Artist> transform(@org.jetbrains.annotations.NotNull()
    java.util.List<com.rklambo.bandhits.data.lastfm.model.LastFmArtist> artists) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.rklambo.bandhits.domain.entity.Artist transform(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.model.LastFmArtist artist) {
        return null;
    }
    
    private final boolean artistHasQualityInfo(com.rklambo.bandhits.data.lastfm.model.LastFmArtist it) {
        return false;
    }
    
    private final boolean isArtistMbidEmpty(com.rklambo.bandhits.data.lastfm.model.LastFmArtist artist) {
        return false;
    }
    
    public ArtistMapper(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.mapper.ImageMapper imageMapper) {
        super();
    }
    
    public ArtistMapper() {
        super();
    }
}