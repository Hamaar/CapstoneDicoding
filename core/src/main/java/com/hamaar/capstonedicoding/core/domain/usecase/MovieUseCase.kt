package com.hamaar.capstonedicoding.core.domain.usecase

import com.hamaar.capstonedicoding.core.data.Resource
import com.hamaar.capstonedicoding.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieUseCase {
    fun getAllMovie(): Flow<Resource<List<Movie>>>
    fun getFavoriteMovie(): Flow<List<Movie>>
    fun setFavoriteMovie(tourism: Movie, state: Boolean)
}