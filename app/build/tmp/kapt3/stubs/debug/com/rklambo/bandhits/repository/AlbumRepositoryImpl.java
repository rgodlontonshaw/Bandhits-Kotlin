package com.rklambo.bandhits.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/rklambo/bandhits/repository/AlbumRepositoryImpl;", "Lcom/rklambo/bandhits/domain/repository/AlbumRepository;", "albumDataSets", "", "Lcom/rklambo/bandhits/repository/dataset/AlbumDataSet;", "(Ljava/util/List;)V", "getAlbum", "Lcom/rklambo/bandhits/domain/entity/Album;", "id", "", "getTopAlbums", "artistId", "artistName", "app_debug"})
public final class AlbumRepositoryImpl implements com.rklambo.bandhits.domain.repository.AlbumRepository {
    private final java.util.List<com.rklambo.bandhits.repository.dataset.AlbumDataSet> albumDataSets = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.rklambo.bandhits.domain.entity.Album getAlbum(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.rklambo.bandhits.domain.entity.Album> getTopAlbums(@org.jetbrains.annotations.Nullable()
    java.lang.String artistId, @org.jetbrains.annotations.Nullable()
    java.lang.String artistName) {
        return null;
    }
    
    public AlbumRepositoryImpl(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.rklambo.bandhits.repository.dataset.AlbumDataSet> albumDataSets) {
        super();
    }
}