package com.rklambo.bandhits.data.lastfm.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/rklambo/bandhits/data/lastfm/model/LastFmResponse;", "", "results", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmResult;", "artist", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmArtist;", "topAlbums", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmTopAlbums;", "similarArtists", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmArtistList;", "album", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmAlbumDetail;", "(Lcom/rklambo/bandhits/data/lastfm/model/LastFmResult;Lcom/rklambo/bandhits/data/lastfm/model/LastFmArtist;Lcom/rklambo/bandhits/data/lastfm/model/LastFmTopAlbums;Lcom/rklambo/bandhits/data/lastfm/model/LastFmArtistList;Lcom/rklambo/bandhits/data/lastfm/model/LastFmAlbumDetail;)V", "getAlbum", "()Lcom/rklambo/bandhits/data/lastfm/model/LastFmAlbumDetail;", "getArtist", "()Lcom/rklambo/bandhits/data/lastfm/model/LastFmArtist;", "getResults", "()Lcom/rklambo/bandhits/data/lastfm/model/LastFmResult;", "getSimilarArtists", "()Lcom/rklambo/bandhits/data/lastfm/model/LastFmArtistList;", "getTopAlbums", "()Lcom/rklambo/bandhits/data/lastfm/model/LastFmTopAlbums;", "app_debug"})
public final class LastFmResponse {
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.data.lastfm.model.LastFmResult results = null;
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.data.lastfm.model.LastFmArtist artist = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "topalbums")
    private final com.rklambo.bandhits.data.lastfm.model.LastFmTopAlbums topAlbums = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "similarartists")
    private final com.rklambo.bandhits.data.lastfm.model.LastFmArtistList similarArtists = null;
    @org.jetbrains.annotations.NotNull()
    private final com.rklambo.bandhits.data.lastfm.model.LastFmAlbumDetail album = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.data.lastfm.model.LastFmResult getResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.data.lastfm.model.LastFmArtist getArtist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.data.lastfm.model.LastFmTopAlbums getTopAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.data.lastfm.model.LastFmArtistList getSimilarArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rklambo.bandhits.data.lastfm.model.LastFmAlbumDetail getAlbum() {
        return null;
    }
    
    public LastFmResponse(@org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.model.LastFmResult results, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.model.LastFmArtist artist, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.model.LastFmTopAlbums topAlbums, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.model.LastFmArtistList similarArtists, @org.jetbrains.annotations.NotNull()
    com.rklambo.bandhits.data.lastfm.model.LastFmAlbumDetail album) {
        super();
    }
}