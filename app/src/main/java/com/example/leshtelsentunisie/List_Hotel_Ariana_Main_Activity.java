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

public class List_Hotel_Ariana_Main_Activity extends AppCompatActivity {
    protected ListView listHAriana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__hotel__ariana__main_);

        // Récupération de la "ListView"
          listHAriana = findViewById(R.id.listHarianaID);

        // Création de la "ArrayList" qui nous permettra de remplir la "ListView"
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();

        // On déclare la "HashMap" qui contiendra les informations pour un item
        HashMap<String, String> map;

        // Création d'une "HashMap" pour insérer les informations du premier item de notre "ListView"

        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.samron_Title));
        map.put("description",getResources().getString(R.string.samron_Description));
        map.put("img", String.valueOf(R.drawable.samroun));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.penthose_Title));
        map.put("description", getResources().getString(R.string.penthose_Description));
        map.put("img", String.valueOf(R.drawable.novotel));
        listItem.add(map);



        // Création d'un SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listItem,
                R.layout.activity_list_item,
                new String[]{"img", "titre", "description"},
                new int[]{R.id.icon, R.id.title, R.id.description});

        // On attribue à notre "ListView" l'adapter
        listHAriana.setAdapter(adapter);
        //short click sur un item
        listHAriana.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(List_Hotel_Ariana_Main_Activity.this,Samron_MainActivity.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(List_Hotel_Ariana_Main_Activity.this, Penthouse_MainActivity.class);
                        startActivity(newActivity1);
                        break;


                                  }
            }
        });
//long click sur un item
        listHAriana.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                // On récupère la "HashMap" contenant les infos de notre item (titre, description, img)
                HashMap map = (HashMap) listHAriana.getItemAtPosition(position);
                // On crée une boite de dialogue
                AlertDialog.Builder adb = new AlertDialog.Builder(List_Hotel_Ariana_Main_Activity.this);
                adb.setTitle("Sélection Item");
                adb.setMessage("Votre choix : " + map.get("titre"));
                adb.setPositiveButton("Ok", null);
                adb.show();
                return true;
            }
        });




            }
}
