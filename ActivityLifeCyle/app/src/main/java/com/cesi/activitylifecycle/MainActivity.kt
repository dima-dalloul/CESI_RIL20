package com.cesi.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    // Cette ligne équivaut à la ligne d'après
    // val TAG = "MainActivity"
    val TAG : String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "Je suis dans le OnCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.i(TAG, "Je suis dans le OnStart")
    }
}