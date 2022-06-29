package com.example.chuckorivan.utils

fun String.fixSpecialChars(): String =
    this.replace("&quot;","\"")