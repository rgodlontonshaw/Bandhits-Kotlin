package com.rklambo.bandhits.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/rklambo/bandhits/domain/repository/AlbumRepository;", "", "getAlbum", "Lcom/rklambo/bandhits/domain/entity/Album;", "id", "", "getTopAlbums", "", "artistId", "artistName", "app_debug"})
public abstract interface AlbumRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.rklambo.bandhits.domain.entity.Album> getTopAlbums(@org.jetbrains.annotations.Nullable()
    java.lang.String artistId, @org.jetbrains.annotations.Nullable()
    java.lang.String artistName);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.rklambo.bandhits.domain.entity.Album getAlbum(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}