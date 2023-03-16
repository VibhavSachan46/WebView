package com.example.webview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class GithuActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)

        val webView = findViewById<WebView>(R.id.webView)
        webviewSetup(webView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webviewSetup(webView: WebView) { //{name: Type}
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled = true
            loadUrl("https://github.com/VibhavSachan46")
        }
    }
}