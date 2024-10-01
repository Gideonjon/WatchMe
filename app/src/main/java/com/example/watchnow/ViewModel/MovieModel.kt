package com.example.watchnow.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.watchnow.model.Data
import kotlinx.coroutines.launch

class MovieModel : ViewModel() {

    private val repository = Repository()
    var state by mutableStateOf(ScreenState())

    init {
        viewModelScope.launch {
repository.getMovieList(state.page)

        }
    }


}

data class ScreenState(
    val movies: List<Data> = emptyList(),
    val page: Int = 1


)