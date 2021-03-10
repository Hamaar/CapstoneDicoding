package com.hamaar.capstonedicoding.detail

import androidx.lifecycle.ViewModel
import com.hamaar.capstonedicoding.core.domain.model.Movie
import com.hamaar.capstonedicoding.core.domain.usecase.MovieUseCase

class DetailViewModel (private val tourismUseCase: MovieUseCase) : ViewModel() {
    fun setFavoriteTourism(movie: Movie, newStatus:Boolean) =
        tourismUseCase.setFavoriteMovie(movie, newStatus)
}