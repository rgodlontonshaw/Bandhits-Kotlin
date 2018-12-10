package com.rklambo.bandhits.data.lastfm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lcom/rklambo/bandhits/data/lastfm/LastFmService;", "", "requestAlbum", "Lretrofit2/Call;", "Lcom/rklambo/bandhits/data/lastfm/model/LastFmResponse;", "id", "", "requestAlbums", "artist", "requestArtistInfo", "language", "requestSimilar", "searchArtist", "app_debug"})
public abstract interface LastFmService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/2.0/?method=artist.search")
    public abstract retrofit2.Call<com.rklambo.bandhits.data.lastfm.model.LastFmResponse> searchArtist(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "artist")
    java.lang.String artist);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/2.0/?method=artist.getinfo")
    public abstract retrofit2.Call<com.rklambo.bandhits.data.lastfm.model.LastFmResponse> requestArtistInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mbid")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lang")
    java.lang.String language);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/2.0/?method=artist.gettopalbums")
    public abstract retrofit2.Call<com.rklambo.bandhits.data.lastfm.model.LastFmResponse> requestAlbums(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mbid")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "artist")
    java.lang.String artist);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/2.0/?method=artist.getsimilar")
    public abstract retrofit2.Call<com.rklambo.bandhits.data.lastfm.model.LastFmResponse> requestSimilar(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mbid")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/2.0/?method=album.getInfo")
    public abstract retrofit2.Call<com.rklambo.bandhits.data.lastfm.model.LastFmResponse> requestAlbum(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mbid")
    java.lang.String id);
}