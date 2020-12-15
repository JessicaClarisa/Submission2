package com.ata.appbundle.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Film(
    val title: String,
    val poster: String,
    val genre: String,
    val running_time: String,
    val original_language: String,
    val overview: String,
    var type: Int,
    var status: Boolean = false
) : Parcelable