package com.dvinfotech.todooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity2 extends AppCompatActivity {

    EditText task, date, time;
    Button add, pdate, ptime;
    RadioButton priorityradiobtn;
    RadioGroup radioGroup;
    public static final String EXTRA_TASK = "com.dvinfotech.multiscreen_app.EXTRA_TASK";
    public static final String EXTRA_DATE = "com.dvinfotech.multiscreen_app.EXTRA_DATE";
    public static final String EXTRA_TIME = "com.dvinfotech.multiscreen_app.EXTRA_TIME";
    public static final String EXTRA_PRIORITY = "com.dvinfotech.multiscreen_app.EXTRA_PRIORITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        task=findViewById(R.id.task);
        date=findViewById(R.id.datee);

        time=findViewById(R.id.timee);

        add=findViewById(R.id.button2);
        pdate=findViewById(R.id.button3);
        ptime=findViewById(R.id.button4);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
    }

    
        public void pickDate(View view) {
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
                    MainActivity2.this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                            // on below line we are setting date to our text view.

                            date.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                        }
                    },
                    // on below line we are passing year,
                    // month and day for selected date in our date picker.
                    year, month, day);
            // at last we are calling show to
            // display our date picker dialog.
            datePickerDialog.show();
        }

    public void pickTime(View v) {
        // on below line we are getting the
        // instance of our calendar.
        final Calendar c = Calendar.getInstance();

        // on below line we are getting our hour, minute.
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // on below line we are initializing our Time Picker Dialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity2.this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay,
                                          int minute) {
                        // on below line we are setting selected time
                        // in our text view.
                        time.setText(hourOfDay + ":" + minute);
                    }
                }, hour, minute, false);
        // at last we are calling show to
        // display our time picker dialog.
        timePickerDialog.show();
    }

    public void add (View view)
    {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        priorityradiobtn = (RadioButton) findViewById(selectedId);
        if(selectedId==-1){
            Toast.makeText(MainActivity2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
        }

        else{
            Toast.makeText(MainActivity2.this,priorityradiobtn.getText(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            String nameText = task.getText().toString();
            intent.putExtra(EXTRA_TASK, nameText);
            String nameText1 = date.getText().toString();
            intent.putExtra(EXTRA_DATE, nameText1);
            String nameText2 = time.getText().toString();
            intent.putExtra(EXTRA_TIME, nameText2);
            String nameText3 = priorityradiobtn.getText().toString();
            intent.putExtra(EXTRA_PRIORITY, nameText3);
            startActivity(intent);
        }
    }


}