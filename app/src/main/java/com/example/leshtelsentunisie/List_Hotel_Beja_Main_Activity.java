package com.example.leshtelsentunisie;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class List_Hotel_Beja_Main_Activity extends AppCompatActivity {
    protected ListView listHBeja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__hotel__beja__main);
        // Récupération de la "ListView"
        listHBeja = findViewById(R.id.listHbejaID);

        // Création de la "ArrayList" qui nous permettra de remplir la "ListView"
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();

        // On déclare la "HashMap" qui contiendra les informations pour un item
        HashMap<String, String> map;

        // Création d'une "HashMap" pour insérer les informations du premier item de notre "ListView"

        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.ramsam_Title));
        map.put("description",getResources().getString(R.string.ramsam_Description));
        map.put("img", String.valueOf(R.drawable.ramsam));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.alrawabi_Title));
        map.put("description", getResources().getString(R.string.alrawabi_Description));
        map.put("img", String.valueOf(R.drawable.alrawabi));
        listItem.add(map);



        // Création d'un SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listItem,
                R.layout.activity_list_item,
                new String[]{"img", "titre", "description"},
                new int[]{R.id.icon, R.id.title, R.id.description});

        // On attribue à notre "ListView" l'adapter
        listHBeja.setAdapter(adapter);
        //short click sur un item
        listHBeja.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(List_Hotel_Beja_Main_Activity.this, Ramsam_MainActivity.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(List_Hotel_Beja_Main_Activity.this, Alrawabi_MainActivity.class);
                        startActivity(newActivity1);
                        break;


                }
            }
        });
//long click sur un item
        listHBeja.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                // On récupère la "HashMap" contenant les infos de notre item (titre, description, img)
                HashMap map = (HashMap) listHBeja.getItemAtPosition(position);
                // On crée une boite de dialogue
                AlertDialog.Builder adb = new AlertDialog.Builder(List_Hotel_Beja_Main_Activity.this);
                adb.setTitle("Sélection Item");
                adb.setMessage("Votre choix : " + map.get("titre"));
                adb.setPositiveButton("Ok", null);
                adb.show();
                return true;
            }
        });




    }
}
