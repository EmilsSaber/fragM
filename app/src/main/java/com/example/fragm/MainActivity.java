package com.example.fragm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String> contacts = new ArrayList<>();
private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       recyclerView = findViewById(R.id.RW);
       contacts.add("ttyyttytytyty");
       contacts.add("ttyyttytytyty");
       contacts.add("ttyyttytytyty");
       contacts.add("ttyyttytytyty");
       contacts.add("ttyyttytytyty");
       contacts.add("ttyyttytytyty");
       contacts.add("ttyyttytytyty");


        ContentAdapter adapter = new ContentAdapter(contacts);
        recyclerView.setAdapter(adapter);
    }
}