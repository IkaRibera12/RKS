package com.myaplikasi.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
    LinearLayout nasgor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nasgor =(LinearLayout) findViewById(R.id.nasgor);

        nasgor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Makanan.class);
                startActivity(intent);

            }
        });
    }
}