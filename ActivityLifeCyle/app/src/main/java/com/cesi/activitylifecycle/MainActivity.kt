package com.cesi.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    // Cette prochaine ligne équivaut à la ligne d'après
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

    override fun onStop() {
        super.onStop()

        Log.i(TAG, "Je suis dans le OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(TAG, "Je suis dans le OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(TAG, "Je suis dans le OnRestart")
    }

    override fun onPause() {
        super.onPause()

        Log.i(TAG, "Je suis dans le OnPause")
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG, "Je suis dans le OnResume")
    }
}