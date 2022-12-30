package com.dvinfotech.background_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b,b1;
    TextView t;
    int counter=0;

    public void startbuttonclicked(View v)
    {
        b1 = findViewById(R.id.button2);
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    public void counterbuttonclicked(View v)
    {
        b = findViewById(R.id.button);
        t = findViewById(R.id.textView);
        counter++;
        t.setText(Integer.toString(counter));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}