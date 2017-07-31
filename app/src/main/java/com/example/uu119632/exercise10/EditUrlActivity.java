package com.example.uu119632.exercise10;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.EditText;
import android.widget.Toast;

/**
 * EditUrlActivity URL入力画面
 *
 * @author :ryo.yamada
 * @since :1.0 :2017/08/01
 */
public class EditUrlActivity extends AppCompatActivity {

    /**
     * 未入力時のメッセージ
     */
    final String URL_EMPTY = "URLを入力してください";

    /**
     * 不正時のメッセージ
     */
    final String URL_INVALID = "URLが不正です";

    /**
     * EditText
     */
    EditText editText;

    /**
     * onCreateメソッド
     *
     * @param savedInstanceState savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_url);

        editText = (EditText) findViewById(R.id.edit_url);

        //show_webviewボタン押下時の処理
        findViewById(R.id.web_view_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String url = editText.getText().toString();

                if (url.isEmpty()) {
                    Toast.makeText(getApplicationContext(), URL_EMPTY, Toast.LENGTH_SHORT).show();
                } else if (!URLUtil.isValidUrl(url)) {
                    Toast.makeText(getApplicationContext(), URL_INVALID, Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(EditUrlActivity.this, WebViewActivity.class);
                    intent.putExtra("url", url);
                    startActivity(intent);
                }
            }
        });
    }
}
