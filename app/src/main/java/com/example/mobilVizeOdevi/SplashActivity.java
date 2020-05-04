package com.example.mobilVizeOdevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private ImageView imgLogo;
    private static int splashTime = 8000;
    private TextView txtYazi1;
    private TextView txtYazi2;
    private TextView txtYazi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgLogo = findViewById(R.id.imgLogo);
        txtYazi1 = findViewById(R.id.ac_splash_yazi1);
        txtYazi2 = findViewById(R.id.ac_splash_yazi2);
        txtYazi3 = findViewById(R.id.ac_splash_yazi3);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        imgLogo.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(gecis);
                finish();
            }
        },splashTime);
        txtYazi1.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(gecis);
                finish();
            }
        },splashTime);
        txtYazi2.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(gecis);
                finish();
            }
        },splashTime);
        txtYazi3.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(gecis);
                finish();
            }
        },splashTime);

    }
}
