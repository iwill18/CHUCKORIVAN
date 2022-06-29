package com.example.chuckorivan.utils

import android.app.AlertDialog
import android.content.Context

class JokeBoxDismiss {
    companion object {
        fun speak(context: Context, message: String) {
            AlertDialog.Builder(context)
                .setTitle("Am I Funny or Nah???")
                .setMessage(message)
                .setPositiveButton("Get Outta Here", null)
                .show()
        }
    }
}