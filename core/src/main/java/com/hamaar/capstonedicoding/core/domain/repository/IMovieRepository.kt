package com.hamaar.capstonedicoding.core.domain.repository

import com.hamaar.capstonedicoding.core.data.Resource
import com.hamaar.capstonedicoding.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {

    fun getAllMovie(): Flow<Resource<List<Movie>>>

    fun getFavoriteMovie(): Flow<List<Movie>>

    fun setFavoriteMovie(movie: Movie, state: Boolean)

}
