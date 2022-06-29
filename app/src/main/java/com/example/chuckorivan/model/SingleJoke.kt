package com.example.chuckorivan.model


import com.google.gson.annotations.SerializedName

data class SingleJoke(
    @SerializedName("type")
    val type: String,
    @SerializedName("value")
    val joke: Joke
)