package com.hamaar.capstonedicoding.core.data.source.local

import com.hamaar.capstonedicoding.core.data.source.local.entity.MovieEntity
import com.hamaar.capstonedicoding.core.data.source.local.room.MovieDao

import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val tourismDao: MovieDao) {


    fun getAllMovie(): Flow<List<MovieEntity>> = tourismDao.getAllMovie()

    fun getFavoriteMovie(): Flow<List<MovieEntity>> = tourismDao.getFavoriteMovie()

    suspend fun insertMovie(movieList: List<MovieEntity>) = tourismDao.insertMovie(movieList)

    fun setFavoriteMovie(movie: MovieEntity, newState: Boolean) {
        movie.isFavorite = newState
        tourismDao.updateFavoriteMovie(movie)
    }
}