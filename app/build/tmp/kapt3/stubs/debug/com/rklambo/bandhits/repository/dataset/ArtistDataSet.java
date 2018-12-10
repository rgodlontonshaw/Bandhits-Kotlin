package com.rklambo.bandhits.repository.dataset;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/rklambo/bandhits/repository/dataset/ArtistDataSet;", "", "requestArtist", "Lcom/rklambo/bandhits/domain/entity/Artist;", "id", "", "requestRecommendedArtists", "", "app_debug"})
public abstract interface ArtistDataSet {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.rklambo.bandhits.domain.entity.Artist> requestRecommendedArtists();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.rklambo.bandhits.domain.entity.Artist requestArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}