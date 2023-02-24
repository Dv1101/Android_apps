package com.dvinfotech.lab2_regform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{

    TextView status, statusname, statusmail;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("value1");
        String mail = bundle.getString("value2");


        status = findViewById(R.id.status);
        status.setText("Registration Successful");

        statusname = findViewById(R.id.statusname);
        statusname.setText(name);

        statusmail = findViewById(R.id.statusmail);
        statusmail.setText(mail);

    }
}