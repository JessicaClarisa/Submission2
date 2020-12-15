package com.ata.appbundle.core.data.source.local

import com.ata.appbundle.core.data.source.local.model.FilmEntity
import com.ata.appbundle.core.data.source.local.room.FilmDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val mFilmDao: FilmDao) {

    fun getAllMovies(): Flow<List<FilmEntity>> = mFilmDao.getMovies()

    fun getMovieByTitle(title: String): Flow<FilmEntity> = mFilmDao.getMovieByTitle(title)

    fun getAllTvShows(): Flow<List<FilmEntity>> = mFilmDao.getTvShows()

    fun getTvShowByTitle(title: String): Flow<FilmEntity> = mFilmDao.getTvShowByTitle(title)

    fun getFavoriteMovies(): Flow<List<FilmEntity>> = mFilmDao.getFavoriteMovies()

    fun getFavoriteTvShows(): Flow<List<FilmEntity>> = mFilmDao.getFavoriteTvShows()

    suspend fun insertMovies(filmEntity: List<FilmEntity>) {
        mFilmDao.insertMovies(filmEntity)
    }

    fun updateFavoriteStatus(filmEntity: FilmEntity) {
        mFilmDao.updateMovie(filmEntity)
    }

}