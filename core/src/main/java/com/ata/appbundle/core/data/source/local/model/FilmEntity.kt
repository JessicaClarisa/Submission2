package com.ata.appbundle.core.data.source.local.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "film_entities")
data class FilmEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "poster")
    val poster: String,

    @ColumnInfo(name = "genre")
    val genre: String,

    @ColumnInfo(name = "running_time")
    val running_time: String,

    @ColumnInfo(name = "original_language")
    val original_language: String,

    @ColumnInfo(name = "overview")
    val overview: String,

    var type: Int,
    var status: Boolean = false
)