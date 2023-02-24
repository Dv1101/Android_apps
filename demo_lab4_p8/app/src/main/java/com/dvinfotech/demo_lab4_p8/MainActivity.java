package com.dvinfotech.demo_lab4_p8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname, pass, mail, addr, age, dob;
    TextView puname, ppass, pmail, paddr, page, pdob, ppgender;
    Button submit, pickdate, clear;
    RadioButton genderradioButton;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = findViewById(R.id.uuname);
        pass = findViewById(R.id.password);
        mail = findViewById(R.id.email);
        addr = findViewById(R.id.address);
        age = findViewById(R.id.age);
        dob = findViewById(R.id.dob);
        submit = findViewById(R.id.button);
        pickdate = findViewById(R.id.button2);
        clear = findViewById(R.id.button3);

        radioGroup=(RadioGroup)findViewById(R.id.rgroup);

        puname = findViewById(R.id.pname);
        ppass = findViewById(R.id.ppass);
        pmail = findViewById(R.id.pemail);
        paddr = findViewById(R.id.paddress);
        page = findViewById(R.id.page);
        pdob = findViewById(R.id.pdob);
        ppgender = findViewById(R.id.ppgender);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = uname.getText().toString();
                String s2 = pass.getText().toString();
                String s3 = mail.getText().toString();
                String s4 = addr.getText().toString();
                String s5 = age.getText().toString();
                String s6 = dob.getText().toString();

                puname.setText(s1);
                ppass.setText(s2);
                pmail.setText(s3);
                paddr.setText(s4);
                page.setText(s5);
                pdob.setText(s6);

                int selectedId = radioGroup.getCheckedRadioButtonId();
                genderradioButton = (RadioButton) findViewById(selectedId);
                if(selectedId==-1){
                    Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                    ppgender.setText("Nothing selected !!!");
                }

                else{
                    Toast.makeText(MainActivity.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                    ppgender.setText(genderradioButton.getText());
                }
            }
        });

        pickdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // on below line we are getting
                // the instance of our calendar.
                final Calendar c = Calendar.getInstance();

                // on below line we are getting
                // our day, month and year.
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                // on below line we are creating a variable for date picker dialog.
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        // on below line we are passing context.
                        MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // on below line we are setting date to our text view.
                                dob.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                            }
                        },
                        // on below line we are passing year,
                        // month and day for selected date in our date picker.
                        year, month, day);
                // at last we are calling show to
                // display our date picker dialog.
                datePickerDialog.show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uname.setText(" ");
                pass.setText("");
                mail.setText(" ");
                addr.setText(" ");
                age.setText(" ");
                dob.setText(" ");
            }
        });
    }
}