package com.dvinfotech.demo_lab3;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity  extends AppCompatActivity {

    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        w1 = findViewById(R.id.webView);
        w1.loadUrl("https://github.com/Dv1101");
    }
}
