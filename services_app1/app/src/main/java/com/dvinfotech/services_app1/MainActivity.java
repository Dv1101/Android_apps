package com.dvinfotech.services_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button startb, stopb, b;
    TextView t;
    String msg = "dvinfotech:";
    int counter = 0;

    public void counterbuttonclicked(View v)
    {
        b = findViewById(R.id.counterb);
        t = findViewById(R.id.textView);
        counter++;
        t.setText(Integer.toString(counter));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() invoked");

        startb = findViewById(R.id.startb);
        stopb = findViewById(R.id.stopb);

    }

    public void startService(View view){
        startService(new Intent(getBaseContext(), Myservice.class));
    }

    public void stopService(View view){
        stopService(new Intent(getBaseContext(), Myservice.class));
    }
}