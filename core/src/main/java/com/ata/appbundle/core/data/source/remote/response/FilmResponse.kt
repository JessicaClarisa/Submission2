package com.ata.appbundle.core.data.source.remote.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FilmResponse(
    val title: String,
    val poster: String,
    val genre: String,
    val running_time: String,
    val original_language: String,
    val overview: String,
    val type: Int
) : Parcelable