package com.dvinfotech.lab2_regform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText n, p, cp, m;
    Button s, c;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n = findViewById(R.id.name);
        p = findViewById(R.id.pass);
        cp = findViewById(R.id.cpass);
        m = findViewById(R.id.mail);
        s = findViewById(R.id.button);
        c = findViewById(R.id.button2);

        s.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Bundle bundle = new Bundle();
                String s1 = n.getText().toString();
                String s2 = m.getText().toString();
                String s3 = p.getText().toString();
                String s4 = cp.getText().toString();
                bundle.putString("value1",s1);
                bundle.putString("value2",s2);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Data Parsed", Toast.LENGTH_SHORT).show();
            }
        });

        c.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                n.setText(" ");
                p.setText("");
                cp.setText("");
                m.setText(" ");
                Toast.makeText(MainActivity.this, "Cleared Fields", Toast.LENGTH_SHORT).show();
            }
        });

    }
}