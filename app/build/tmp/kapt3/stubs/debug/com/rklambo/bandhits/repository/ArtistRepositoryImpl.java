package com.rklambo.bandhits.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/rklambo/bandhits/repository/ArtistRepositoryImpl;", "Lcom/rklambo/bandhits/domain/repository/ArtistRepository;", "artistDataSets", "", "Lcom/rklambo/bandhits/repository/dataset/ArtistDataSet;", "(Ljava/util/List;)V", "getArtist", "Lcom/rklambo/bandhits/domain/entity/Artist;", "id", "", "getRecommendedArtists", "app_debug"})
public final class ArtistRepositoryImpl implements com.rklambo.bandhits.domain.repository.ArtistRepository {
    private final java.util.List<com.rklambo.bandhits.repository.dataset.ArtistDataSet> artistDataSets = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.rklambo.bandhits.domain.entity.Artist> getRecommendedArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rklambo.bandhits.domain.entity.Artist getArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public ArtistRepositoryImpl(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.rklambo.bandhits.repository.dataset.ArtistDataSet> artistDataSets) {
        super();
    }
}