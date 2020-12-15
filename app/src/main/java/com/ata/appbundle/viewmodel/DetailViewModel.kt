package com.ata.appbundle.viewmodel

import androidx.lifecycle.*
import com.ata.appbundle.core.data.Resource
import com.ata.appbundle.core.domain.model.Film
import com.ata.appbundle.core.domain.usecase.FilmUseCase
import kotlinx.coroutines.flow.Flow

class DetailViewModel(private val filmUseCase: FilmUseCase) : ViewModel() {
    private lateinit var film: Flow<Resource<Film>>
    private lateinit var filmLiveData: LiveData<Resource<Film>>
    private var title = MutableLiveData<String>()
    private var type: Int = 0

    fun setTitle(title: String) {
        this.title.value = title
    }

    fun setType(type: Int) {
        this.type = type
    }


    var detail: LiveData<Resource<Film>> = Transformations.switchMap(title) {
        when (type) {
            1 -> filmLiveData = filmUseCase.getMovieByTitle(title.value.toString()).asLiveData()
            2 -> filmLiveData = filmUseCase.getTvShowByTitle(title.value.toString()).asLiveData()
        }
        return@switchMap filmLiveData
    }

    fun setFav(): LiveData<Resource<Film>> {
        val filmResource = detail.value
        if (filmResource != null) {
            val film = filmResource.data
            if (film != null) {
                //val newState = !film.status
                filmUseCase.setFavoriteStatus(film)
            }
        }
        return filmLiveData
    }

}