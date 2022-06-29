package com.example.chuckorivan.network

import com.example.chuckorivan.model.Joke
import java.lang.Exception

sealed class Results {
    object LOADING: Results()
    data class SUCCESS(val response: List<Joke>): Results()
    data class ERROR(val error: Exception): Results()
}
