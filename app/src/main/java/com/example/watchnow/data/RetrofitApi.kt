package com.example.watchnow.data

import com.example.watchnow.model.MoviesList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitApi {
    @GET("movies?")
    suspend fun getMovies(
        @Query("page")page:Int
    ): Response<MoviesList>
}