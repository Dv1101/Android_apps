package com.dvinfotech.listview_app5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String[] arr = {"hello", "This is test","123","Dhruv","Dhairya","Tirth","Malav","Vishal","Tirth","Diksha","Himani"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);

        // Normal List view (default android list view)
        //ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        //listview.setAdapter(ad);

        //using custom adapter
        dhruv ab = new dhruv(this, R.layout.main_dhruv_layout_res, arr);
        listview.setAdapter(ab);


    }
}