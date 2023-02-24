package com.dvinfotech.Radiobtn_p12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton r1;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textview);
        r1 = findViewById(R.id.radioButton);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(
                view -> {
                    if (r1.isChecked()) {
                        t1.setText("Checked");
                    }
                    else {
                        t1.setText("Unchecked..");
                    }
                }
        );
    }

}
