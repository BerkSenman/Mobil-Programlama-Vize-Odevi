package com.example.mobilVizeOdevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textViewBaslik,textViewAciklama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent getData = getIntent();

        String baslik = getData.getStringExtra("HEADER");
        String aciklama = getData.getStringExtra("DESCRIPTION");

        textViewBaslik = findViewById(R.id.activityDetailBaslik);
        textViewAciklama = findViewById(R.id.activityDetailAciklama);

        textViewBaslik.setText(baslik);
        textViewAciklama.setText(aciklama);
    }
}
