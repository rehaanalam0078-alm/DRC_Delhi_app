package com.drcdelhi.app

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.drcdelhi.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private var websiteLoaded = false

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {

        // MUST be before super.onCreate()
        val splashScreen = installSplashScreen()

        // Keep splash screen visible until website loads
        splashScreen.setKeepOnScreenCondition {
            !websiteLoaded
        }

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars =
                insets.getInsets(WindowInsetsCompat.Type.systemBars())

            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )

            insets
        }

        binding.DRCDelhi.settings.javaScriptEnabled = true

        binding.DRCDelhi.webViewClient = object : WebViewClient() {

            override fun onPageFinished(
                view: WebView?,
                url: String?
            ) {
                super.onPageFinished(view, url)

                // Website has finished loading
                websiteLoaded = true
            }
        }

        binding.DRCDelhi.loadUrl("https://drcdelhi.in/")
    }

    override fun onKeyDown(
        keyCode: Int,
        event: KeyEvent?
    ): Boolean {

        if (
            keyCode == KeyEvent.KEYCODE_BACK &&
            binding.DRCDelhi.canGoBack()
        ) {
            binding.DRCDelhi.goBack()
            return true
        }

        return super.onKeyDown(keyCode, event)
    }
}