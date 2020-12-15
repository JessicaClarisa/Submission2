package com.ata.appbundle.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/ata/appbundle/core/domain/usecase/FilmInteractor;", "Lcom/ata/appbundle/core/domain/usecase/FilmUseCase;", "filmRepository", "Lcom/ata/appbundle/core/domain/repository/IFilmRepository;", "(Lcom/ata/appbundle/core/domain/repository/IFilmRepository;)V", "getAllMovies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ata/appbundle/core/data/Resource;", "", "Lcom/ata/appbundle/core/domain/model/Film;", "getAllTvShows", "getFavoriteMovies", "getFavoriteTvShows", "getMovieByTitle", "movieTitle", "", "getTvShowByTitle", "tvShowTitle", "setFavoriteStatus", "", "film", "core_release"})
public final class FilmInteractor implements com.ata.appbundle.core.domain.usecase.FilmUseCase {
    private final com.ata.appbundle.core.domain.repository.IFilmRepository filmRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.Resource<java.util.List<com.ata.appbundle.core.domain.model.Film>>> getAllMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.Resource<com.ata.appbundle.core.domain.model.Film>> getMovieByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String movieTitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.Resource<java.util.List<com.ata.appbundle.core.domain.model.Film>>> getAllTvShows() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.Resource<com.ata.appbundle.core.domain.model.Film>> getTvShowByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String tvShowTitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.domain.model.Film>> getFavoriteMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.ata.appbundle.core.domain.model.Film>> getFavoriteTvShows() {
        return null;
    }
    
    @java.lang.Override()
    public void setFavoriteStatus(@org.jetbrains.annotations.NotNull()
    com.ata.appbundle.core.domain.model.Film film) {
    }
    
    public FilmInteractor(@org.jetbrains.annotations.NotNull()
    com.ata.appbundle.core.domain.repository.IFilmRepository filmRepository) {
        super();
    }
}