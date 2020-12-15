package com.ata.appbundle.core.data.source.remote

import android.util.Log
import com.ata.appbundle.core.data.source.remote.network.ApiResponse
import com.ata.appbundle.core.data.source.remote.network.ApiService
import com.ata.appbundle.core.data.source.remote.response.FilmResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteDataSource(private val apiService: ApiService) {

    fun getAllMovies(): Flow<ApiResponse<List<FilmResponse>>> {
        return flow {
            try {
                val response = apiService.getMovies()
                if (response.isNotEmpty()){
                    emit(ApiResponse.Success(response))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e : Exception){
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)

    }

    fun getAllTvShows(): Flow<ApiResponse<List<FilmResponse>>> {
        return flow {
            try {
                val response = apiService.getTvShows()
                if (response.isNotEmpty()){
                    emit(ApiResponse.Success(response))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e : Exception){
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)

    }

}