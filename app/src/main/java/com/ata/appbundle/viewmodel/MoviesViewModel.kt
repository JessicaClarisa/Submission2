package com.ata.appbundle.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.ata.appbundle.core.domain.usecase.FilmUseCase

class MoviesViewModel(private val filmUseCase: FilmUseCase) : ViewModel() {
    private val result = MutableLiveData<String>()

    val movies = filmUseCase.getAllMovies().asLiveData()

    fun setType(type: String) {
        this.result.value = type
    }

}