package com.myaplikasi.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Makanan extends AppCompatActivity {
    LinearLayout btnbayar;
    Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        btnbayar = (LinearLayout) findViewById(R.id.btnbayar);
        btnback = (Button) findViewById(R.id.btnback);

        btnbayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Makanan.this, Pesan.class);
                startActivity(intent);

            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
}