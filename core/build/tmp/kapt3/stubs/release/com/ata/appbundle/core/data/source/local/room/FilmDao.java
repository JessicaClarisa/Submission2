package com.ata.appbundle.core.data.source.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000b\u001a\u00020\fH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000b\u001a\u00020\fH\'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u001f\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/ata/appbundle/core/data/source/local/room/FilmDao;", "", "deleteMovie", "", "filmEntity", "Lcom/ata/appbundle/core/data/source/local/model/FilmEntity;", "getFavoriteMovies", "Lkotlinx/coroutines/flow/Flow;", "", "getFavoriteTvShows", "getMovieByTitle", "title", "", "getMovies", "getTvShowByTitle", "getTvShows", "insertMovies", "filmEntities", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMovie", "core_release"})
public abstract interface FilmDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM film_entities WHERE type = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.data.source.local.model.FilmEntity>> getMovies();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM film_entities WHERE type = 1 AND title = :title")
    public abstract kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.source.local.model.FilmEntity> getMovieByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM film_entities WHERE type = 2")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.data.source.local.model.FilmEntity>> getTvShows();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM film_entities WHERE type = 2 AND title = :title")
    public abstract kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.source.local.model.FilmEntity> getTvShowByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM film_entities WHERE type = 1 AND status = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.data.source.local.model.FilmEntity>> getFavoriteMovies();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM film_entities WHERE type = 2 AND status = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.data.source.local.model.FilmEntity>> getFavoriteTvShows();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ata.appbundle.core.data.source.local.model.FilmEntity> filmEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Update()
    public abstract void updateMovie(@org.jetbrains.annotations.NotNull()
    com.ata.appbundle.core.data.source.local.model.FilmEntity filmEntity);
    
    @androidx.room.Delete()
    public abstract void deleteMovie(@org.jetbrains.annotations.NotNull()
    com.ata.appbundle.core.data.source.local.model.FilmEntity filmEntity);
}