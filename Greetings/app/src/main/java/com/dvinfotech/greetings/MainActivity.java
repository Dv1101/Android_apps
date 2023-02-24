package com.dvinfotech.greetings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    TextView view1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText)findViewById(R.id.nameinput);
        view1 = (TextView)findViewById(R.id.textView);
    }

    public void onClick(View view)
    {
        String currentDateTimeAString= DateFormat.getDateInstance().format(new Date());
        if(text1.getText().toString()=="")
        {
            view1.setText("Hello!! \r\nThe current date is "+currentDateTimeAString);
        }
        else
        {
            view1.setText("Hello!! " +text1.getText().toString()+"\r\nThe current date is "+currentDateTimeAString);
        }
    }
}