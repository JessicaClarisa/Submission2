package com.ata.appbundle.di

import com.ata.appbundle.core.domain.usecase.FilmInteractor
import com.ata.appbundle.core.domain.usecase.FilmUseCase
import com.ata.appbundle.viewmodel.*
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<FilmUseCase> { FilmInteractor(get()) }
}

val viewModelModule = module {
    viewModel { MoviesViewModel(get()) }
    viewModel { TvShowsViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}