package com.example.recylerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailMakanan extends AppCompatActivity {
    TextView tvnamadetail;
    TextView tvhargadetail;
    ImageView imgDetail;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_makanan);

        tvnamadetail = findViewById(R.id.tvNamadetail);
        tvhargadetail = findViewById(R.id.tvhargadetail);
        imgDetail = findViewById(R.id.imgDetail);
        btnback = (Button)findViewById(R.id.back);
        Intent intent = getIntent();

        String namamakanan = getIntent().getStringExtra("namamakanan");
        String hargamakanan = getIntent().getStringExtra("hargamakanan");
        int imagedetail = getIntent().getIntExtra("image", 0);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(DetailMakanan.this, MainActivity.class);
                startActivity(back);
            }
        });

        tvnamadetail.setText(namamakanan);
        tvhargadetail.setText(hargamakanan);
        imgDetail.setImageResource(imagedetail);
        }
    }
