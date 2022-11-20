package com.example.chapter5ps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Canvas;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact o1 = new Contact(1, "9898989898", "Harry");
    Contact o2 = new Contact(1, "9898989898", "Harry");
    Contact o3 = new Contact(1, "9898989898", "Harry");
    Contact o4 = new Contact(1, "9898989898", "Harry");
    Contact o5 = new Contact(1, "9898989898", "Harry");
    Contact o6 = new Contact(1, "9898989898", "Harry");
    Contact o7 = new Contact(1, "9898989898", "Harry");
    Contact o8 = new Contact(1, "9898989898", "Harry");
    Contact o9 = new Contact(1, "9898989898", "Harry");

    Contact [] contacts = {o1, o2, o3, o4, o5, o6, o7, o8, o9};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}