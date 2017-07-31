package com.example.uu119632.exercise10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * WebViewActivity html表示画面
 *
 * @author :ryo.yamada
 * @since :1.0 :2017/08/01
 */
public class WebViewActivity extends Activity {

    /**
     * onCreateメソッド
     *
     * @param savedInstanceState savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Intent intent = getIntent();

        //WebViewの読み込み
        WebView webview = (WebView) findViewById(R.id.webView);
        //WebViewClientをセット
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(intent.getStringExtra("url"));
    }
}
