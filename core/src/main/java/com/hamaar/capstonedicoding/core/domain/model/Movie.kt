package com.hamaar.capstonedicoding.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var overview: String,
    var original_language: String,
    var original_title: String,
    var title: String,
    var poster_path: String,
    var backdrop_path: String,
    var release_date: String,
    var popularity: Double,
    var vote_average: Double,
    var id: Int,
    var adult: Boolean,
    var isFavorite: Boolean 
) : Parcelable