package com.dvinfotech.services_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startb, stopb;
    String msg = "dvinfotech:";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() invoked");

        startb = findViewById(R.id.startb);
        stopb = findViewById(R.id.stopb);

//        startb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startService();
//            }
//        });
//
//        stopb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                stopService();
//            }
//        });

    }

    public void startService(View view){
        startService(new Intent(getBaseContext(), Myservice.class));
    }

    public void stopService(View view){
        stopService(new Intent(getBaseContext(), Myservice.class));
    }
}