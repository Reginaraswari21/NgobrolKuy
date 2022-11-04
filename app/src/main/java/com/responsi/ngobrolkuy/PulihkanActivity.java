package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PulihkanActivity extends AppCompatActivity {
    private ImageView btnKembali;
    private TextView btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulihkan);

        btnKembali = findViewById(R.id.ImgPanah);
        btnSubmit = findViewById(R.id.btnChangePW);

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PulihkanActivity.this, SettingsActivity.class);
                startActivity(i);
            }
        });
        btnSubmit.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PulihkanActivity.this, NgobrolKuy.class));
            }
        }));
    }
}