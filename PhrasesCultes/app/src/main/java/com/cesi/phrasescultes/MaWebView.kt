package com.cesi.phrasescultes

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MaWebView: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val maWebView : WebView = WebView(this)
        setContentView(maWebView)

        maWebView.loadUrl("https://www.android.com")
    }
}