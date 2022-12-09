package com.dvinfotech.lab2_regform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText n, p, cp, m;
    Button s, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n = findViewById(R.id.name);
        p = findViewById(R.id.pass);
        cp = findViewById(R.id.cpass);
        m = findViewById(R.id.mail);
        s = findViewById(R.id.button);
        c = findViewById(R.id.button2);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), MainActivity2.class);
                String s1 = n.getText().toString();
                String s2 = m.getText().toString();
                String s3 = .getText().toString();
            }
        });

    }
}