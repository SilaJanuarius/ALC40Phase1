package com.kilonzosila.alc40;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonalc;
    Button buttonprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonalc = findViewById(R.id.btnAbout);
        buttonprofile = findViewById(R.id.btnProfile);

        buttonprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileintent = new Intent(MainActivity.this,MyProfile.class);
                startActivity(profileintent);
            }
        });

        buttonalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alcintent = new Intent(MainActivity.this,AboutALC.class);
                startActivity(alcintent);

            }
        });
    }
}
