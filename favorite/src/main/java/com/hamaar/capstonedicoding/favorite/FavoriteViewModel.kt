package com.hamaar.capstonedicoding.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hamaar.capstonedicoding.core.domain.usecase.MovieUseCase

class FavoriteViewModel(tourismUseCase: MovieUseCase) : ViewModel() {
    val favoriteTourism = tourismUseCase.getFavoriteMovie().asLiveData()
}

