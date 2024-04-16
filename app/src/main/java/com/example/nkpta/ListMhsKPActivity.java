    package com.example.nkpta;

    import android.annotation.SuppressLint;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.LinearLayoutManager;
    import androidx.recyclerview.widget.RecyclerView;

    import java.util.ArrayList;

    public class ListMhsKPActivity extends AppCompatActivity {

        private ArrayList<NilaiKpItem> modelkp;
        private RecyclerView recyclerView;
        private NilaiKpAdapter adapter;
        private Button backButton;


        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            backButton = findViewById(R.id.backbtn);

            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });

            getData();

            recyclerView = findViewById(R.id.recyclerviewkp);
            adapter = new NilaiKpAdapter(this, modelkp);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ListMhsKPActivity.this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
        }

        private void getData() {
            modelkp = new ArrayList<>();
            modelkp.add(new NilaiKpItem("Ilham", "123456", "FrontEnd"));
            modelkp.add(new NilaiKpItem("Akbar", "654321", "BackEnd"));
        }



    }