package com.rklambo.bandhits.data.lastfm.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lcom/rklambo/bandhits/data/lastfm/model/LastFmAlbum;", "", "name", "", "mbid", "url", "artist", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmArtist;", "images", "", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmImage;", "tracks", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmTracklist;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/rklambo/bandhits/data/lastfm/model/LastFmArtist;Ljava/util/List;Lcom/rklambo/bandhits/data/lastfm/model/LastFmTracklist;)V", "getArtist", "()Lcom/rklambo/bandhits/data/lastfm/model/LastFmArtist;", "getImages", "()Ljava/util/List;", "getMbid", "()Ljava/lang/String;", "getName", "getTracks", "()Lcom/rklambo/bandhits/data/lastfm/model/LastFmTracklist;", "getUrl", "app_debug"})
public final class LastFmAlbum {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mbid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.data.lastfm.model.LastFmArtist artist = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "image")
    private final java.util.List<com.rklambo.bandhits.data.lastfm.model.LastFmImage> images = null;
    @org.jetbrains.annotations.Nullable()
    private final com.rklambo.bandhits.data.lastfm.model.LastFmTracklist tracks = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMbid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.data.lastfm.model.LastFmArtist getArtist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.rklambo.bandhits.data.lastfm.model.LastFmImage> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.rklambo.bandhits.data.lastfm.model.LastFmTracklist getTracks() {
        return null;
    }
    
    public LastFmAlbum(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String mbid, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.model.LastFmArtist artist, @org.jetbrains.annotations.NotNull()
    java.util.List<com.rklambo.bandhits.data.lastfm.model.LastFmImage> images, @org.jetbrains.annotations.Nullable()
    com.rklambo.bandhits.data.lastfm.model.LastFmTracklist tracks) {
        super();
    }
}