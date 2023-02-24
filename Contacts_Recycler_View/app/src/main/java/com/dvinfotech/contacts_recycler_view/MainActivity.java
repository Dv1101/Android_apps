package com.dvinfotech.contacts_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Contact o1 = new Contact("1", "9999988888", "Dhruv Varia");
    Contact o2 = new Contact("2", "6360442734", "Dhairya Amin");
    Contact o3 = new Contact("3", "2983584518", "Diksha Mehta");
    Contact o4 = new Contact("4", "9016740833", "Tirth Shah");
    Contact o5 = new Contact("5", "4597417565", "Vasu Rakholiya");
    Contact o6 = new Contact("6", "9757266857", "Vishal Singala");
    Contact o7 = new Contact("7", "9942147785", "Harsh Varia");
    Contact o8 = new Contact("8", "8679786646", "Bharvi Varia");
    Contact o9 = new Contact("9", "5153478897", "Neha Varia");
    Contact o10 = new Contact("10", "6004876602", "Manthan Sangani");
    Contact o11= new Contact("11", "9999988888", "ViralMan");
    Contact o12 = new Contact("12", "9999988888", "Amit Patel");
    Contact o13= new Contact("13", "9999988888", "BigBoss");
    Contact o14 = new Contact("14", "9999988888", "Mukesh Ambani");
    Contact o15 = new Contact("15", "9999988888", "Anil Ambani");
    Contact o16 = new Contact("16", "9999988888", "Elon Musk");
    Contact o17 = new Contact("17", "9999988888", "Dhruv Varia");
    Contact o18 = new Contact("18", "9999988888", "Dhruv Varia");
    Contact o19 = new Contact("19", "9999988888", "Dhruv Varia");
    Contact o20 = new Contact("20", "9999988888", "Dhruv Varia");

    Contact [] contacts ={o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20};
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
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