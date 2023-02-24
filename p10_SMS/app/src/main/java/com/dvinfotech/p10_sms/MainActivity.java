package com.dvinfotech.p10_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendSMS();
            }
        });
    }
    @SuppressLint("IntentReset")
    protected void sendSMS()
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("smsto:"));
        intent.setType("vnd.android-dir/mms-sms");
        intent.putExtra("address", new String("01234"));
        intent.putExtra("sms_body", "test");

        try {
               startActivity(intent);
        }
        catch(Exception ex)
        {
            Toast.makeText(this, "SMS failed, retry" +ex, Toast.LENGTH_SHORT).show();
        }
    }

}