package com.ata.appbundle.core.data.source.local.room

import androidx.room.*
import com.ata.appbundle.core.data.source.local.model.FilmEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FilmDao {

    @Query("SELECT * FROM film_entities WHERE type = 1")
    fun getMovies(): Flow<List<FilmEntity>>

    @Query("SELECT * FROM film_entities WHERE type = 1 AND title = :title")
    fun getMovieByTitle(title: String): Flow<FilmEntity>

    @Query("SELECT * FROM film_entities WHERE type = 2")
    fun getTvShows(): Flow<List<FilmEntity>>

    @Query("SELECT * FROM film_entities WHERE type = 2 AND title = :title")
    fun getTvShowByTitle(title: String): Flow<FilmEntity>

    @Query("SELECT * FROM film_entities WHERE type = 1 AND status = 1")
    fun getFavoriteMovies(): Flow<List<FilmEntity>>

    @Query("SELECT * FROM film_entities WHERE type = 2 AND status = 1")
    fun getFavoriteTvShows(): Flow<List<FilmEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovies(filmEntities: List<FilmEntity>)

    @Update
    fun updateMovie(filmEntity: FilmEntity)

    @Delete
    fun deleteMovie(filmEntity: FilmEntity)
}