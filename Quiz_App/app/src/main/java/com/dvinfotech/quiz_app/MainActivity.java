package com.dvinfotech.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button yes;
    Button no;
    TextView question;

    private String[] questions = {"Java is a person?", "Java was introduced in 1233?","Java was created using Python?","Java has Abstract classes?","Java supports interface?"};
    private Boolean[] answers = {false,false,false,true,true};
    private int index = 0;
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.que);
        question.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length-1)
                {
                    if(answers[index])
                    {
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1)
                    {
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your score is " +score+ "/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Restart the app to play again !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length-1)
                {
                    if(!answers[index])
                    {
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1)
                    {
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your score is " +score+ "/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Restart the app to play again !!!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}