package com.example.chuckorivan.model


import com.google.gson.annotations.SerializedName

data class MultipleJoke(
    @SerializedName("type")
    val type: String,
    @SerializedName("value")
    val jokes: List<Joke>
)