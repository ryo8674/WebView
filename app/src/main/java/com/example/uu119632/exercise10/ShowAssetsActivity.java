package com.example.uu119632.exercise10;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

/**
 * ShowAssetsActivity html表示画面
 *
 * @author :ryo.yamada
 * @since :1.0 :2017/08/01
 */
public class ShowAssetsActivity extends Activity {

    /** webview */
    WebView webView;

    /**
     * onCreateメソッド
     * @param savedInstanceState savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);

        // html表示
        webView = (WebView)findViewById(R.id.html);
        webView.loadUrl("file:///android_asset/sample.html");

    }
}
