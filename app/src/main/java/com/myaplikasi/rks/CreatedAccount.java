package com.myaplikasi.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreatedAccount extends AppCompatActivity {

    Button btnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_created_account);

        btnhome=(Button)findViewById(R.id.btnhome);


        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreatedAccount.this, Home.class);
                startActivity(intent);

            }
        });
    }
}