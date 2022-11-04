package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NgobrolKuy extends AppCompatActivity {
    private ImageView btnSetting;
    private TextView chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngobrol_kuy);

        btnSetting=findViewById(R.id.imgSetting);
        chat=findViewById(R.id.chatJuned);


        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NgobrolKuy.this, SettingsActivity.class));
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NgobrolKuy.this, RoomChatActivity.class));
            }
        });

    }
}