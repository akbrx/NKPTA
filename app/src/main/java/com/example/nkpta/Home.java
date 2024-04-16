package com.example.nkpta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    private Button btnKP, btnTA;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, Logout.class);
        startActivity(intent);
        finish(); // Menutup halaman home setelah navigasi ke halaman logout
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btnKP = findViewById(R.id.btnKP);
        btnTA = findViewById(R.id.btnTA);

        //button untuk KP
        btnKP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ListMhsKPActivity.class);
                startActivity(intent);
            }
        });

        //=============================pemisah========================================//

        //button untuk TA
        btnTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ListMhsTAActivity.class);
                startActivity(intent);
            }
        });
    }
}
