package com.example.nkpta;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListMhsTAActivity extends AppCompatActivity {

    private ArrayList<NilaiTaItem> modelta;
    private RecyclerView recyclerView;
    private NilaiTaAdapter adapter;
    private Button backButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        backButton = findViewById(R.id.backbtn);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        getData();

        recyclerView = findViewById(R.id.recyclerviewta);
        adapter = new NilaiTaAdapter(this, modelta);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ListMhsTAActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        modelta = new ArrayList<>();
        modelta.add(new NilaiTaItem("udin", "78910", "FrontEnd"));
        modelta.add(new NilaiTaItem("ujang", "10987", "BackEnd"));
    }

}