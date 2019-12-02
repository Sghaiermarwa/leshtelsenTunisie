package com.example.leshtelsentunisie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Samron_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samron__main);
        ImageView img = (ImageView) findViewById(R.id.loc);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // le click sur l'icone de lacalisation entraine l'ouverture d'une autre activity google maps
                Intent newActivity1 = new Intent(Samron_MainActivity.this, MapsActivitySamron.class);
                startActivity(newActivity1);
            }
        });

    }
}
