package com.ata.appbundle.core.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0006\u0010\u000e\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H&\u00a8\u0006\u0012"}, d2 = {"Lcom/ata/appbundle/core/domain/repository/IFilmRepository;", "", "getAllMovies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ata/appbundle/core/data/Resource;", "", "Lcom/ata/appbundle/core/domain/model/Film;", "getAllTvShows", "getFavoriteMovies", "getFavoriteTvShows", "getMovieByTitle", "movieTitle", "", "getTvShowByTitle", "tvShowTitle", "setFavoriteStatus", "", "film", "core_debug"})
public abstract interface IFilmRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.Resource<java.util.List<com.ata.appbundle.core.domain.model.Film>>> getAllMovies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.Resource<com.ata.appbundle.core.domain.model.Film>> getMovieByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String movieTitle);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.Resource<java.util.List<com.ata.appbundle.core.domain.model.Film>>> getAllTvShows();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.Resource<com.ata.appbundle.core.domain.model.Film>> getTvShowByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String tvShowTitle);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.domain.model.Film>> getFavoriteMovies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.domain.model.Film>> getFavoriteTvShows();
    
    public abstract void setFavoriteStatus(@org.jetbrains.annotations.NotNull()
    com.ata.appbundle.core.domain.model.Film film);
}