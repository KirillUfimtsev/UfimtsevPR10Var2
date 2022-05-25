package com.example.ufimtsevpr10var2

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.example.ufimtsevpr10var2.databinding.ActivityMain3Binding


class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val myWebView = binding.wbView as WebView
        myWebView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        myWebView.settings.allowFileAccess = true
        myWebView.loadUrl("https://developer.android.com")

    }

}