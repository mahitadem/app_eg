package com.jiad.intent_cal_and

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class webactivity : AppCompatActivity() {
    lateinit var webview:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webactivity)
        webview=findViewById(R.id.webView2)
        insta()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun insta(){
        webview.webViewClient= WebViewClient()
        webview.apply {
            loadUrl("https://www.instagram.com/")
            settings.javaScriptEnabled
            settings.safeBrowsingEnabled
        }
    }
}