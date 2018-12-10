package com.rklambo.bandhits.data.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0010J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/rklambo/bandhits/data/mapper/AlbumMapper;", "", "artistMapper", "Lcom/rklambo/bandhits/data/mapper/ArtistMapper;", "imageMapper", "Lcom/rklambo/bandhits/data/mapper/ImageMapper;", "trackMapper", "Lcom/rklambo/bandhits/data/mapper/TrackMapper;", "(Lcom/rklambo/bandhits/data/mapper/ArtistMapper;Lcom/rklambo/bandhits/data/mapper/ImageMapper;Lcom/rklambo/bandhits/data/mapper/TrackMapper;)V", "albumHasQualityInfo", "", "album", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmAlbum;", "isAlbumMbidEmpty", "transform", "Lcom/rklambo/bandhits/domain/entity/Album;", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmAlbumDetail;", "", "albums", "app_debug"})
public final class AlbumMapper {
    private final com.rklambo.bandhits.data.mapper.ArtistMapper artistMapper = null;
    private final com.rklambo.bandhits.data.mapper.ImageMapper imageMapper = null;
    private final com.rklambo.bandhits.data.mapper.TrackMapper trackMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.rklambo.bandhits.domain.entity.Album> transform(@org.jetbrains.annotations.NotNull()
    java.util.List<com.rklambo.bandhits.data.lastfm.model.LastFmAlbum> albums) {
        return null;
    }
    
    private final boolean albumHasQualityInfo(com.rklambo.bandhits.data.lastfm.model.LastFmAlbum album) {
        return false;
    }
    
    private final boolean isAlbumMbidEmpty(com.rklambo.bandhits.data.lastfm.model.LastFmAlbum album) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.rklambo.bandhits.domain.entity.Album transform(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.model.LastFmAlbumDetail album) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.rklambo.bandhits.domain.entity.Album transform(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.model.LastFmAlbum album) {
        return null;
    }
    
    public AlbumMapper(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.mapper.ArtistMapper artistMapper, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.mapper.ImageMapper imageMapper, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.mapper.TrackMapper trackMapper) {
        super();
    }
    
    public AlbumMapper() {
        super();
    }
}