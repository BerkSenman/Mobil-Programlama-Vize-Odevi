package com.example.mobilVizeOdevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editKullanici;
    EditText editSifre;
    Button btnGirisYap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editKullanici = findViewById(R.id.editKullanici);
        editSifre = findViewById(R.id.editSifre);
        btnGirisYap = findViewById(R.id.btnGirisYap);

        btnGirisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kullanici = editKullanici.getText().toString();
                String sifre = editSifre.getText().toString();

                if (kullanici.equals("admin") && sifre.equals("admin")) {
                    Toast.makeText(LoginActivity.this,"Giriş Başarılı!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
                if (!kullanici.equals("admin") || !sifre.equals("admin")) {
                    Toast.makeText(LoginActivity.this,"Kullanıcı adı veya şifreyi hatalı girdiniz!",Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
