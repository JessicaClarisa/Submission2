package com.ata.appbundle.core.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u001f\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/ata/appbundle/core/data/source/local/LocalDataSource;", "", "mFilmDao", "Lcom/ata/appbundle/core/data/source/local/room/FilmDao;", "(Lcom/ata/appbundle/core/data/source/local/room/FilmDao;)V", "getAllMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ata/appbundle/core/data/source/local/model/FilmEntity;", "getAllTvShows", "getFavoriteMovies", "getFavoriteTvShows", "getMovieByTitle", "title", "", "getTvShowByTitle", "insertMovies", "", "filmEntity", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteStatus", "core_debug"})
public final class LocalDataSource {
    private final com.ata.appbundle.core.data.source.local.room.FilmDao mFilmDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.data.source.local.model.FilmEntity>> getAllMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.source.local.model.FilmEntity> getMovieByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.data.source.local.model.FilmEntity>> getAllTvShows() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.source.local.model.FilmEntity> getTvShowByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.data.source.local.model.FilmEntity>> getFavoriteMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.data.source.local.model.FilmEntity>> getFavoriteTvShows() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ata.appbundle.core.data.source.local.model.FilmEntity> filmEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void updateFavoriteStatus(@org.jetbrains.annotations.NotNull()
    com.ata.appbundle.core.data.source.local.model.FilmEntity filmEntity) {
    }
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.ata.appbundle.core.data.source.local.room.FilmDao mFilmDao) {
        super();
    }
}