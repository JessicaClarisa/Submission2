package com.ata.appbundle.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.ata.appbundle.core.domain.usecase.FilmUseCase

class TvShowsViewModel(private val filmUseCase: FilmUseCase) : ViewModel() {
    private val result = MutableLiveData<String>()

    val tvShows = filmUseCase.getAllTvShows().asLiveData()

    fun setType(type: String) {
        this.result.value = type
    }
}