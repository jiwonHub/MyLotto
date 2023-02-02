package com.example.lotto.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.lotto.R


class WebViewActivity : AppCompatActivity() {

    private val webView: WebView by lazy{
        findViewById(R.id.webView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        initViews()
    }

    @SuppressLint("SetJavaScriptEnabled") // 보안상의 이슈 때문에 자바스크립트 기능을 제공하지 않았음.
    private fun initViews(){
        webView.webViewClient = WebViewClient() // 웹을 외부에서 열지않고 앱 내에서 바로 열기
        webView.settings.javaScriptEnabled = true // 웹에서 제공하는 자바스크립트 기능을 수행
        webView.loadUrl(DEFAULT_URL)
    }

    companion object{
        private const val DEFAULT_URL = "https://m.dhlottery.co.kr/store.do?method=sellerInfo645"
    }
}