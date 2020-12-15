package com.ata.appbundle.core.domain.usecase

import com.ata.appbundle.core.domain.model.Film
import com.ata.appbundle.core.domain.repository.IFilmRepository


class FilmInteractor(private val filmRepository: IFilmRepository): FilmUseCase {

    override fun getAllMovies() = filmRepository.getAllMovies()

    override fun getMovieByTitle(movieTitle: String) = filmRepository.getMovieByTitle(movieTitle)

    override fun getAllTvShows() = filmRepository.getAllTvShows()

    override fun getTvShowByTitle(tvShowTitle: String) = filmRepository.getTvShowByTitle(tvShowTitle)

    override fun getFavoriteMovies() = filmRepository.getFavoriteMovies()

    override fun getFavoriteTvShows() = filmRepository.getFavoriteTvShows()

    override fun setFavoriteStatus(film: Film) = filmRepository.setFavoriteStatus(film)


}