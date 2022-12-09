package com.dvinfotech.multiscreen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String EXTRA_NAME = "com.dvinfotech.multiscreen_app.EXTRA_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View v)
    {
        Toast.makeText(this, "Going to Second Activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        name = findViewById(R.id.name1);
        String nameText = name.getText().toString();
        intent.putExtra(EXTRA_NAME, nameText);
        startActivity(intent);
    }

    public void clear_screen(View view)
    {
                name.setText(" ");
                Toast.makeText(MainActivity.this, "Data Cleared", Toast.LENGTH_SHORT).show();
            }
    }


