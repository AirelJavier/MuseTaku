package com.example.musetaku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    TextView vocaloidtxt, jsongtxt, animetxt, gametxt;
    ImageView vocaloidImg, jsongImg, animeImg, gameImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        vocaloidtxt = findViewById(R.id.vocText);
        jsongtxt = findViewById(R.id.vocText);
        animetxt = findViewById(R.id.animeText);
        gametxt = findViewById(R.id.gameText);
        vocaloidImg = findViewById(R.id.vocImage);
        jsongImg = findViewById(R.id.jsImage);
        animeImg = findViewById(R.id.animeImage);
        gameImg = findViewById(R.id.gameImage);

        vocaloidtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, listVocaloid.class);
                startActivity(intent);
            }
        });
        vocaloidImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, listVocaloid.class);
                startActivity(intent);
            }
        });
        jsongtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, listVocaloid.class);
                startActivity(intent);
            }
        });
        jsongImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, listVocaloid.class);
                startActivity(intent);
            }
        });
        animetxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, listVocaloid.class);
                startActivity(intent);
            }
        });
        animeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, listVocaloid.class);
                startActivity(intent);
            }
        });
        gametxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, listVocaloid.class);
                startActivity(intent);
            }
        });
        gameImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, listVocaloid.class);
                startActivity(intent);
            }
        });
    }

}