package com.dvinfotech.todooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button b1;
    TextView t1, t2, t3, t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        t1 = findViewById(R.id.ttask);
        t2 = findViewById(R.id.tdate);
        t3 = findViewById(R.id.ttime);
        t4 = findViewById(R.id.tprio);

        Intent intent = getIntent();
        String ptask = intent.getStringExtra(MainActivity2.EXTRA_TASK);
        String pdate = intent.getStringExtra(MainActivity2.EXTRA_DATE);
        String ptime = intent.getStringExtra(MainActivity2.EXTRA_TIME);
        String ppriority = intent.getStringExtra(MainActivity2.EXTRA_PRIORITY);

        t1.setText(ptask);
        t2.setText(pdate);
        t3.setText(ptime);
        t4.setText(ppriority);

    }

    public void openActivity(View view)
    {
        Toast.makeText(this, "Going to ADD Activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}