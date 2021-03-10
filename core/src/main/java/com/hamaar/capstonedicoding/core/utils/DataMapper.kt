package com.hamaar.capstonedicoding.core.utils

import com.hamaar.capstonedicoding.core.data.source.local.entity.MovieEntity
import com.hamaar.capstonedicoding.core.data.source.remote.response.MovieResponse
import com.hamaar.capstonedicoding.core.domain.model.Movie

object DataMapper {
    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                id = it.id,
                overview = it.overview,
                title = it.title,
                release_date = it.releaseDate,
                poster_path = it.posterPath,
                popularity = it.popularity,
                original_title = it.originalTitle,
                original_language = it.originalLanguage,
                vote_average = it.voteAverage,
                backdrop_path = it.backdropPath,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                id = it.id,
                overview = it.overview,
                title = it.title,
                release_date = it.release_date,
                poster_path = it.poster_path,
                popularity = it.popularity,
                original_title = it.original_title,
                original_language = it.original_language,
                vote_average = it.vote_average,
                backdrop_path = it.backdrop_path,
                adult = it.adult,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Movie) = MovieEntity(
        id = input.id,
        overview = input.overview,
        title = input.title,
        release_date = input.release_date,
        poster_path = input.poster_path,
        popularity = input.popularity,
        original_title = input.original_title,
        original_language = input.original_language,
        vote_average = input.vote_average,
        backdrop_path = input.backdrop_path,
        adult = input.adult,
        isFavorite = input.isFavorite
    )
}