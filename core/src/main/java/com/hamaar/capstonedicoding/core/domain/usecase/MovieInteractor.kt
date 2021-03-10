package com.hamaar.capstonedicoding.core.domain.usecase

import com.hamaar.capstonedicoding.core.domain.model.Movie
import com.hamaar.capstonedicoding.core.domain.repository.IMovieRepository

class MovieInteractor(private val tourismRepository: IMovieRepository): MovieUseCase {

    override fun getAllMovie() = tourismRepository.getAllMovie()

    override fun getFavoriteMovie() = tourismRepository.getFavoriteMovie()

    override fun setFavoriteMovie(tourism: Movie, state: Boolean) = tourismRepository.setFavoriteMovie(tourism, state)
}