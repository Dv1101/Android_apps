package com.dvinfotech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonEqual, buttonCLear;
    TextView T1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.b0);
        button1 = findViewById(R.id.b1);
        button2 = findViewById(R.id.b2);
        button3 = findViewById(R.id.b3);
        button4 = findViewById(R.id.b4);
        button5 = findViewById(R.id.b5);
        button6 = findViewById(R.id.b6);
        button7 = findViewById(R.id.b7);
        button8 = findViewById(R.id.b8);
        button9 = findViewById(R.id.b9);
        buttonAdd = findViewById(R.id.b_add);
        buttonSub = findViewById(R.id.b_sub);
        buttonDivision = findViewById(R.id.b_div);
        buttonMul = findViewById(R.id.b_mul);

        buttonEqual = findViewById(R.id.b_equ);
        buttonCLear = findViewById(R.id.b_clear);

        T1 = findViewById(R.id.T1);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setText(T1.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setText(T1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setText(T1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setText(T1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setText(T1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setText(T1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setText(T1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setText(T1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setText(T1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setText(T1.getText() + "9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonCLear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}