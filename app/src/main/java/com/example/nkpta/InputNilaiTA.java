package com.example.nkpta;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InputNilaiTA extends AppCompatActivity {


    private Button backButton, simpanButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputnilaita);

        //agar nama di inputnilaikpnya sesuai dengan nama dan nim yg di klik di rv
        TextView namaTextView = findViewById(R.id.namamhsta);
        TextView nimTextView = findViewById(R.id.nimmhsta);
        TextView judulTextView = findViewById(R.id.judulmhsta);

        String nama = getIntent().getStringExtra("nama");
        String nim = getIntent().getStringExtra("nim");
        String judul = getIntent().getStringExtra("judul");

        namaTextView.setText(nama);
        nimTextView.setText(nim);
        judulTextView.setText(judul);

        //=============================pemisah========================================//

        //inisialisasi Button
        backButton = findViewById(R.id.backbtn);
        simpanButton = findViewById(R.id.simpanbtn);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        simpanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InputNilaiTA.this, "nilai tersimpan", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        //=============================pemisah========================================//

        //untuk nambahkan gambar
        ImageView gambarImageView = findViewById(R.id.pp);
        gambarImageView.setImageResource(R.drawable.akbar12250113387);
    }
}