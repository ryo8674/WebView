package com.example.uu119632.exercise10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * MainActivity メイン画面
 *
 * @author :ryo.yamada
 * @since :1.0 :2017/08/01
 */
public class MainActivity extends AppCompatActivity {

    /**
     * onCreateメソッド
     *
     * @param savedInstanceState savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // edit_urlボタンの遷移
        findViewById(R.id.edit_url_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EditUrlActivity.class);
                startActivity(intent);
            }
        });

        // show_assetsボタンの遷移
        findViewById(R.id.show_assets_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShowAssetsActivity.class);
                startActivity(intent);
            }
        });
    }
}
