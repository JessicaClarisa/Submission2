package com.ata.appbundle.core.data.source.remote.network

import com.ata.appbundle.core.data.source.remote.response.FilmResponse
import retrofit2.http.GET

interface ApiService {
    @GET("movies")
    suspend fun getMovies(): List<FilmResponse>

    @GET("tv-shows")
    suspend fun getTvShows(): List<FilmResponse>
}
