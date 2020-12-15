package com.ata.appbundle.core.utils

import com.ata.appbundle.core.data.source.local.model.FilmEntity
import com.ata.appbundle.core.data.source.remote.response.FilmResponse
import com.ata.appbundle.core.domain.model.Film

object DataMapper {
    fun mapResponsesToEntities(input: List<FilmResponse>): List<FilmEntity> {
        val tourismList = ArrayList<FilmEntity>()
        input.map {
            val film = FilmEntity(
                title = it.title,
                poster = it.poster,
                genre = it.genre,
                running_time = it.running_time,
                original_language = it.original_language,
                overview = it.overview,
                type = it.type,
                status = false
            )
            tourismList.add(film)
        }
        return tourismList
    }

    fun mapEntitiesToDomain(input: List<FilmEntity>): List<Film> =
        input.map {
            Film(
                title = it.title,
                poster = it.poster,
                genre = it.genre,
                running_time = it.running_time,
                original_language = it.original_language,
                overview = it.overview,
                type = it.type,
                status = it.status
            )
        }

    fun mapEntityToDomain(input: FilmEntity): Film =
        Film(
            title = input.title,
            poster = input.poster,
            genre = input.genre,
            running_time = input.running_time,
            original_language = input.original_language,
            overview = input.overview,
            type = input.type,
            status = input.status
        )

    fun mapDomainToEntity(input: Film) = FilmEntity(
        title = input.title,
        poster = input.poster,
        genre = input.genre,
        running_time = input.running_time,
        original_language = input.original_language,
        overview = input.overview,
        type = input.type,
        status = input.status
    )
}