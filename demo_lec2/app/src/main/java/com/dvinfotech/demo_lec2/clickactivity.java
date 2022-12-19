package com.dvinfotech.demo_lec2;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class clickactivity extends AppCompatActivity {

    Button b1;
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        b1 = findViewById(R.id.button);
        w1 = findViewById(R.id.webView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(clickactivity.this, "Welcome to new world !!!", Toast.LENGTH_LONG).show();
                w1.loadUrl("https://github.com/Dv1101");
            }
        });
    }
}
