package com.rklambo.bandhits.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016R\u0014\u0010\u0007\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/rklambo/bandhits/data/CloudArtistDataSet;", "Lcom/rklambo/bandhits/repository/dataset/ArtistDataSet;", "language", "", "lastFmService", "Lcom/rklambo/bandhits/data/lastfm/LastFmService;", "(Ljava/lang/String;Lcom/rklambo/bandhits/data/lastfm/LastFmService;)V", "coldplayMbid", "getColdplayMbid", "()Ljava/lang/String;", "getLanguage", "requestArtist", "Lcom/rklambo/bandhits/domain/entity/Artist;", "id", "requestRecommendedArtists", "", "app_debug"})
public final class CloudArtistDataSet implements com.rklambo.bandhits.repository.dataset.ArtistDataSet {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coldplayMbid = "cc197bad-dc9c-440d-a5b5-d52ba2e14234";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String language = null;
    private final com.rklambo.bandhits.data.lastfm.LastFmService lastFmService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getColdplayMbid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.rklambo.bandhits.domain.entity.Artist> requestRecommendedArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.rklambo.bandhits.domain.entity.Artist requestArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public CloudArtistDataSet(@org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.LastFmService lastFmService) {
        super();
    }
}