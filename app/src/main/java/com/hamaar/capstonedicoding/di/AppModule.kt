package com.hamaar.capstonedicoding.di

import com.hamaar.capstonedicoding.core.domain.usecase.MovieInteractor
import com.hamaar.capstonedicoding.core.domain.usecase.MovieUseCase
import com.hamaar.capstonedicoding.detail.DetailViewModel
import com.hamaar.capstonedicoding.movie.MovieViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { MovieViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}