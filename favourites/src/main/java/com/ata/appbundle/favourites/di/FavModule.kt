package com.ata.appbundle.favourites.di

import com.ata.appbundle.favourites.FavMoviesViewModel
import com.ata.appbundle.favourites.FavTvShowsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val favModules = module {
    viewModel { FavMoviesViewModel(get()) }
    viewModel { FavTvShowsViewModel(get()) }
}