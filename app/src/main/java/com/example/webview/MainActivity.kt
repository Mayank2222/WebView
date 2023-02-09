package com.example.webview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewID = findViewById<WebView>(R.id.webView) //Creating Web-view variable
        webViewSetup(webViewID)
    }
   @RequiresApi(Build.VERSION_CODES.O)
   private fun webViewSetup(webViewID: WebView){ //Fun keyword is used to create a method.
                        //(name of the variable: type )
       webViewID.webViewClient= WebViewClient() //To apply web-view we use webViewClient
       webViewID.apply {  // To apply the settings
           settings.javaScriptEnabled= true
           settings.safeBrowsingEnabled= true
           loadUrl("https://jcboseust.ac.in")

           // For internet to work go to manifest folder and allow access to the internet

       }
   }

}