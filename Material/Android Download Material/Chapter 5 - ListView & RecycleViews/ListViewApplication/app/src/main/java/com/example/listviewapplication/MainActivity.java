package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[] = {"This is", "Item", "Item2", "Another Item", "another", "nau", "Mail3", "Mail4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Here is a further list of layouts that you can use: http://developer.android.com/reference/android/R.layout.html
//        (Updated link thanks @Estel: https://github.com/android/platform_frameworks_base/tree/master/core/res/res/layout )
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        // Using Built in Array Adapater
        // ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        // listView.setAdapter(ad);

        // Using our custom Adapter
        HarryAdapter ad = new HarryAdapter(this, R.layout.my_harry_layout, arr);
        listView.setAdapter(ad);

        // Listener on ArrayAdapter Listview
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "You Clicked on: " + i, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}