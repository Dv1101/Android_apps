package com.dvinfotech.multiscreen_app;

import static com.dvinfotech.multiscreen_app.R.id.txtvw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    DateFormat df = new SimpleDateFormat("HH");
    String date = df.format(Calendar.getInstance().getTime());
    int time = Integer.parseInt(date);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        textView = findViewById(txtvw);
        if(time<=11)
        {
            textView.setText("Good Morning, " +name);
        }

        if(time>11 && time<16)
        {
            textView.setText("Good Afternoon, " +name);
        }

        if(time>=16 && time<=19)
        {
            textView.setText("Good Evening, " +name);
        }

        if(time>=20)
        {
            textView.setText("Good Night, " +name);
        }
    }
}