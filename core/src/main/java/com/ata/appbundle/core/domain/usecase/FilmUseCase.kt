package com.ata.appbundle.core.domain.usecase

import com.ata.appbundle.core.data.Resource
import com.ata.appbundle.core.domain.model.Film
import kotlinx.coroutines.flow.Flow

interface FilmUseCase {
    fun getAllMovies(): Flow<Resource<List<Film>>>
    fun getMovieByTitle(movieTitle: String): Flow<Resource<Film>>
    fun getAllTvShows(): Flow<Resource<List<Film>>>
    fun getTvShowByTitle(tvShowTitle: String): Flow<Resource<Film>>
    fun getFavoriteMovies(): Flow<List<Film>>
    fun getFavoriteTvShows(): Flow<List<Film>>
    fun setFavoriteStatus(film: Film)

}