package com.example.chuckorivan.utils

import com.example.chuckorivan.model.Joke
import com.example.chuckorivan.model.MultipleJoke
import com.example.chuckorivan.model.SingleJoke

fun SingleJoke.toJokeList(): List<Joke> = listOf(this.joke)
fun MultipleJoke.toJokeList(): List<Joke> = this.jokes