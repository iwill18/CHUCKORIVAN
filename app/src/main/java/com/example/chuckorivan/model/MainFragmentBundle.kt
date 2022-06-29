package com.example.chuckorivan.model

data class MainFragmentBundle(
    val jokeList: MutableList<Joke> = mutableListOf(),
    var expanded: Boolean = false,
    var isConfigChange: Boolean = false
)
