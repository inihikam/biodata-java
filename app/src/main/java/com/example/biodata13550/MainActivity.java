package com.example.biodata13550;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlamat, btnTelepon, btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTelepon = findViewById(R.id.btnTelepon);
        btnEmail = findViewById(R.id.btnEmail);
        btnAlamat = findViewById(R.id.btnAlamat);
        String email = "maulanahikam085@gmail.com";

        btnTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "082243539209";
                Intent menelepon = new Intent(Intent.ACTION_DIAL);
                menelepon.setData(Uri.fromParts("tel", nomor, null));
                startActivity(menelepon);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mengemail = new Intent(Intent.ACTION_VIEW
                , Uri.parse("mailto:"+ email));
                startActivity(mengemail);
            }
        });

        btnAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openMap = new Intent(Intent.ACTION_VIEW
                , Uri.parse("geo:-7.03647,110.49291?z=18"));
                startActivity(openMap);
            }
        });
    }
}