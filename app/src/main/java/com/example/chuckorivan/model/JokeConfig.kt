package com.example.chuckorivan.model

data class JokeConfig(
    var first_name: String? = null,
    var last_name: String? = null,
    var no_explicit: Boolean = false,
) {
    fun getExcludeList(): List<String>? {
        val lst: MutableList<String> = mutableListOf()
        if (no_explicit) lst.add("explicit")

        return lst.ifEmpty{null}
    }
}
