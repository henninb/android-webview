package com.bhenning.ghost

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var mywebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mywebView = findViewById(R.id.webview)
        mywebView.webViewClient = WebViewClient()
        mywebView.loadUrl("https://www.example.com/")
        val webSettings: WebSettings = mywebView.settings
        webSettings.javaScriptEnabled = true

    }
}