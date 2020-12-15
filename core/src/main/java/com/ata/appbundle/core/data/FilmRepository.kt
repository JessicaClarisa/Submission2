package com.ata.appbundle.core.data

import com.ata.appbundle.core.data.source.local.LocalDataSource
import com.ata.appbundle.core.data.source.remote.RemoteDataSource
import com.ata.appbundle.core.data.source.remote.network.ApiResponse
import com.ata.appbundle.core.data.source.remote.response.FilmResponse
import com.ata.appbundle.core.domain.model.Film
import com.ata.appbundle.core.domain.repository.IFilmRepository
import com.ata.appbundle.core.utils.AppExecutors
import com.ata.appbundle.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class FilmRepository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
)
    : IFilmRepository {


    override fun getAllMovies(): Flow<Resource<List<Film>>> {
        return object : NetworkBoundResource<List<Film>, List<FilmResponse>>() {
            public override fun loadFromDB(): Flow<List<Film>> {
                return localDataSource.getAllMovies().map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Film>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<FilmResponse>>> =
                remoteDataSource.getAllMovies()

            override suspend fun saveCallResult(data: List<FilmResponse>) {
                val movieList = DataMapper.mapResponsesToEntities(data)
                for (item in movieList) {
                    item.type = 1
                }
                localDataSource.insertMovies(movieList)
            }
        }.asFlow()
    }

    override fun getMovieByTitle(movieTitle: String): Flow<Resource<Film>> {
        return object : NetworkBoundResource<Film, FilmResponse>() {
            override fun loadFromDB(): Flow<Film> {
                return localDataSource.getMovieByTitle(movieTitle).map {
                    DataMapper.mapEntityToDomain(it)
                }
            }

            override fun shouldFetch(data: Film?): Boolean {
                return data == null
            }

            override suspend fun createCall(): Flow<ApiResponse<FilmResponse>> {
                TODO("Not yet implemented")
            }

            override suspend fun saveCallResult(data: FilmResponse) {

            }

        }.asFlow()
    }

    override fun getAllTvShows(): Flow<Resource<List<Film>>> {
        return object : NetworkBoundResource<List<Film>, List<FilmResponse>>() {
            public override fun loadFromDB(): Flow<List<Film>> {
                return localDataSource.getAllTvShows().map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Film>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<FilmResponse>>> =
                remoteDataSource.getAllTvShows()

            override suspend fun saveCallResult(data: List<FilmResponse>) {
                val tvShowList = DataMapper.mapResponsesToEntities(data)
                for (item in tvShowList) {
                    item.type = 2
                }
                localDataSource.insertMovies(tvShowList)
            }
        }.asFlow()
    }

    override fun getTvShowByTitle(tvShowTitle: String): Flow<Resource<Film>> {
        return object : NetworkBoundResource<Film, FilmResponse>() {
            override fun loadFromDB(): Flow<Film> {
                return localDataSource.getTvShowByTitle(tvShowTitle).map {
                    DataMapper.mapEntityToDomain(it)
                }
            }

            override fun shouldFetch(data: Film?): Boolean {
                return data == null
            }

            override suspend fun createCall(): Flow<ApiResponse<FilmResponse>> {
                TODO("Not yet implemented")
            }

            override suspend fun saveCallResult(data: FilmResponse) {

            }

        }.asFlow()
    }

    override fun getFavoriteMovies(): Flow<List<Film>> {
        return localDataSource.getFavoriteMovies().map {
            DataMapper.mapEntitiesToDomain(it)
        }
    }

    override fun getFavoriteTvShows(): Flow<List<Film>> {
        return localDataSource.getFavoriteTvShows().map {
            DataMapper.mapEntitiesToDomain(it)
        }
    }


    override fun setFavoriteStatus(film: Film) {
        val status: Boolean = !film.status
        film.status = status
        val filmEntity = DataMapper.mapDomainToEntity(film)
        appExecutors.diskIO().execute { localDataSource.updateFavoriteStatus(filmEntity)}
    }

}