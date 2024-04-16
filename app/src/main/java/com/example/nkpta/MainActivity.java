package com.example.nkpta;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNIP, editTextPassword;
    private Button loginButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editTextNIP = findViewById(R.id.editTextNIP);
        editTextPassword = findViewById(R.id.editTextPassword);
        loginButton = findViewById(R.id.login);

        if (loginButton != null) {
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nip = editTextNIP.getText().toString();
                    String password = editTextPassword.getText().toString();

                    if (isValid(nip, password)) {
                        loginSuccess();
                    } else {
                        Toast.makeText(MainActivity.this, "NIP atau Password tidak salah.", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }


    //logika login dgn NIP minimal 6 angka dan pass 6 huruf
    private boolean isValid(String nip, String password) {

        boolean isNipValid = nip.length() == 6 && nip.matches("[0-9]+");
        boolean isPasswordValid = password.length() >= 6;

        return isNipValid && isPasswordValid;
    }


    // Metode yang dipanggil saat login berhasil
    private void loginSuccess() {
        // Di sini Anda dapat melakukan tindakan setelah login berhasil, seperti membuka halaman berikutnya
        Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
        // Contoh: Intent untuk membuka halaman berikutnya
        Intent intent = new Intent(MainActivity.this, Home.class);
        startActivity(intent);
    }


}
