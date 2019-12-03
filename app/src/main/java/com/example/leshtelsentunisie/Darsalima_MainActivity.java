package com.example.leshtelsentunisie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Darsalima_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darsalima__main);

        ImageView img = findViewById(R.id.locdarsalima);
        // le click sur l'icone de lacalisation entraine l'ouverture d'une autre activity google maps
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent newActivity1 = new Intent(Darsalima_MainActivity.this, MapsActivityDarsaliam.class);
                startActivity(newActivity1);
            }
        });
        ImageView img2 = (ImageView) findViewById(R.id.teldarsalima);
        // le click sur l'icone de téléphone entraine l'appelle  du numero d'hotol
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri telephone = Uri.parse("tel: 52 315 012");
                Intent secondeActivity = new Intent(Intent.ACTION_DIAL, telephone);
                PackageManager manager = getPackageManager();
                ComponentName component = secondeActivity.resolveActivity(manager);
                // On vérifie que component n'est pas null
                if (component != null) {
                    startActivity(secondeActivity);
                    finish();
                }
            }
        });
    }
}
