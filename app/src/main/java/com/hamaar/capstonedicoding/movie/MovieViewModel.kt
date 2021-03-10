package com.hamaar.capstonedicoding.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hamaar.capstonedicoding.core.domain.usecase.MovieUseCase

class MovieViewModel(tourismUseCase: MovieUseCase) : ViewModel() {
    val movie = tourismUseCase.getAllMovie().asLiveData()
}