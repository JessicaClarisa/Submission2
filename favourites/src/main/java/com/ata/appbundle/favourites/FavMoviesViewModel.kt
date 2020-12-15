package com.ata.appbundle.favourites

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.ata.appbundle.core.domain.usecase.FilmUseCase

class FavMoviesViewModel(private val filmUseCase: FilmUseCase) : ViewModel() {
    private val type = MutableLiveData<String>()

    val movies = filmUseCase.getFavoriteMovies().asLiveData()

    fun setType(type: String) {
        this.type.value = type
    }

}