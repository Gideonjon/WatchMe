package com.example.watchnow.ViewModel

import com.example.watchnow.model.MoviesList
import com.example.watchnow.utils.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun  getMovieList(page:Int) : Response<MoviesList>{
        return RetrofitInstance.api.getMovies(page)
    }

}