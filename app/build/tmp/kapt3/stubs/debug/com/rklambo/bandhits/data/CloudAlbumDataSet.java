package com.rklambo.bandhits.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/rklambo/bandhits/data/CloudAlbumDataSet;", "Lcom/rklambo/bandhits/repository/dataset/AlbumDataSet;", "lastFmService", "Lcom/rklambo/bandhits/data/lastfm/LastFmService;", "(Lcom/rklambo/bandhits/data/lastfm/LastFmService;)V", "requestAlbum", "Lcom/rklambo/bandhits/domain/entity/Album;", "mbid", "", "requestTopAlbums", "", "artistId", "artistName", "app_debug"})
public final class CloudAlbumDataSet implements com.rklambo.bandhits.repository.dataset.AlbumDataSet {
    private final com.rklambo.bandhits.data.lastfm.LastFmService lastFmService = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.rklambo.bandhits.domain.entity.Album requestAlbum(@org.jetbrains.annotations.NotNull()
    java.lang.String mbid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.rklambo.bandhits.domain.entity.Album> requestTopAlbums(@org.jetbrains.annotations.Nullable()
    java.lang.String artistId, @org.jetbrains.annotations.Nullable()
    java.lang.String artistName) {
        return null;
    }
    
    public CloudAlbumDataSet(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.LastFmService lastFmService) {
        super();
    }
}