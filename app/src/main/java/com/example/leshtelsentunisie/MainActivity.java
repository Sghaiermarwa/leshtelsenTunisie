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

public class MainActivity extends AppCompatActivity {
    protected ListView listGouvernorat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupération de la "ListView" créée dans le fichier activity_main.xml
        listGouvernorat = findViewById(R.id.listHarianaID);

        // Création de la "ArrayList" qui nous permettra de remplir la "ListView"
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();

        // On déclare la "HashMap" qui contiendra les informations pour un item
        HashMap<String, String> map;

        // Création d'une "HashMap" pour insérer les informations du premier item de notre "ListView"
        //Ariana
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Ariana));
        map.put("description",getResources().getString(R.string.Ariana_Description));
        map.put("img", String.valueOf(R.drawable.ariana));
        listItem.add(map);
        //Béja
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Béja));
        map.put("description", getResources().getString(R.string.Béja_Description));
        map.put("img", String.valueOf(R.drawable.beja));
        listItem.add(map);
        //BenArous
        map = new HashMap<>();
        map.put("titre",getResources().getString(R.string.BenArous));
        map.put("description",getResources().getString(R.string.BenArous_Description));
        map.put("img", String.valueOf(R.drawable.benarous));
        listItem.add(map);
        //Bizerte
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Bizerte));
        map.put("description", getResources().getString(R.string.Bizerte_Description));
        map.put("img", String.valueOf(R.drawable.bizerte));
        listItem.add(map);
        //Gabès
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Gabès));
        map.put("description", getResources().getString(R.string.Gabès_Description));
        map.put("img", String.valueOf(R.drawable.gabes));
        listItem.add(map);
        //Gafsa
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Gafsa));
        map.put("description", getResources().getString(R.string.Gafsa_Description));
        map.put("img", String.valueOf(R.drawable.gafsa));
        listItem.add(map);
        //Jendouba
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Jendouba));
        map.put("description", getResources().getString(R.string.Jendouba_Description));
        map.put("img", String.valueOf(R.drawable.jendouba));
        listItem.add(map);
        //Kairouan
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Kairouan));
        map.put("description", getResources().getString(R.string.Kairouan_Description));
        map.put("img", String.valueOf(R.drawable.kairouan));
        listItem.add(map);
        //Kasserine
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Kasserine));
        map.put("description", getResources().getString(R.string.Kasserine_Description));
        map.put("img", String.valueOf(R.drawable.kasserine));
        listItem.add(map);
        //Kébili
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Kébili));
        map.put("description", getResources().getString(R.string.Kébili_Description));
        map.put("img", String.valueOf(R.drawable.kebili));
        listItem.add(map);
        //LeKef
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.LeKef));
        map.put("description", getResources().getString(R.string.LeKef_Description));
        map.put("img", String.valueOf(R.drawable.lekef));
        listItem.add(map);
        //Mahdia
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Mahdia));
        map.put("description", getResources().getString(R.string.Mahdia_Description));
        map.put("img", String.valueOf(R.drawable.mahdia));
        listItem.add(map);
        //LaManouba
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.LaManouba));
        map.put("description", getResources().getString(R.string.LaManouba_Description));
        map.put("img", String.valueOf(R.drawable.lamanouba));
        listItem.add(map);
        //Médenine
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Médenine));
        map.put("description", getResources().getString(R.string.Médenine_Description));
        map.put("img", String.valueOf(R.drawable.medenine));
        listItem.add(map);
        //Béja
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Monastir));
        map.put("description", getResources().getString(R.string.Monastir_Description));
        map.put("img", String.valueOf(R.drawable.monastir));
        listItem.add(map);
        //Nabeul
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Nabeul));
        map.put("description", getResources().getString(R.string.Nabeul_Description));
        map.put("img", String.valueOf(R.drawable.nabeul));
        listItem.add(map);
        //sfax
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Sfax));
        map.put("description", getResources().getString(R.string.Sfax_Description));
        map.put("img", String.valueOf(R.drawable.sfax));
        listItem.add(map);
        //SidiBouzid
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.SidiBouzid));
        map.put("description", getResources().getString(R.string.SidiBouzid_Description));
        map.put("img", String.valueOf(R.drawable.sidibouzid));
        listItem.add(map);
        //Siliana
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Siliana));
        map.put("description", getResources().getString(R.string.Siliana_Description));
        map.put("img", String.valueOf(R.drawable.siliana));
        listItem.add(map);
        //Sousse
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Sousse));
        map.put("description", getResources().getString(R.string.Sousse_Description));
        map.put("img", String.valueOf(R.drawable.sousse));
        listItem.add(map);
        //Tataouine
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Tataouine));
        map.put("description", getResources().getString(R.string.Tataouine_Description));
        map.put("img", String.valueOf(R.drawable.tataouine));
        listItem.add(map);
        //Tozeur
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Tozeur));
        map.put("description", getResources().getString(R.string.Tozeur_Description));
        map.put("img", String.valueOf(R.drawable.tozeur));
        listItem.add(map);
        //Tunis
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Tunis));
        map.put("description", getResources().getString(R.string.Tunis_Description));
        map.put("img", String.valueOf(R.drawable.tunis));
        listItem.add(map);
        //Zaghouan
        map = new HashMap<>();
        map.put("titre", getResources().getString(R.string.Zaghouan));
        map.put("description", getResources().getString(R.string.Zaghouan_Description));
        map.put("img", String.valueOf(R.drawable.zaghouan));
        listItem.add(map);


        // Création d'un SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listItem,
                R.layout.activity_list_item,
                new String[]{"img", "titre", "description"},
                new int[]{R.id.icon, R.id.title, R.id.description});

        // On attribue à notre "ListView" l'adapter
        listGouvernorat.setAdapter(adapter);
        //short click sur un item
        listGouvernorat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(MainActivity.this,List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(MainActivity.this, List_Hotel_Beja_Main_Activity.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(MainActivity.this, List_Hotel_Benarous_Main_Activity.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity3);
                        break;
                    case 4:
                        Intent newActivity4 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity4);
                        break;
                    case 5:
                        Intent newActivity5 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity5);
                        break;
                    case 6:
                        Intent newActivity6 = new Intent(MainActivity.this,List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity6);
                        break;
                    case 7:
                        Intent newActivity7 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity7);
                        break;
                    case 8:
                        Intent newActivity8 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity8);
                        break;
                    case 9:
                        Intent newActivity9 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity9);
                        break;
                    case 10:
                        Intent newActivity10 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity10);
                        break;
                    case 11:
                        Intent newActivity11 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity11);
                        break;
                    case 12:
                        Intent newActivity12 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity12);
                        break;
                    case 13:
                        Intent newActivity13 = new Intent(MainActivity.this,List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity13);
                        break;
                    case 14:
                        Intent newActivity14 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity14);
                        break;
                    case 15:
                        Intent newActivity15 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity15);
                        break;
                    case 16:
                        Intent newActivity16 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity16);
                        break;
                    case 17:
                        Intent newActivity17 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity17);
                        break;
                    case 18:
                        Intent newActivity18 = new Intent(MainActivity.this,List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity18);
                        break;
                    case 19:
                        Intent newActivity19 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity19);
                        break;
                    case 20:
                        Intent newActivity20 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity20);
                        break;
                    case 21:
                        Intent newActivity21 = new Intent(MainActivity.this,List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity21);
                        break;
                    case 22:
                        Intent newActivity22 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity22);
                        break;
                    case 23:
                        Intent newActivity23 = new Intent(MainActivity.this, List_Hotel_Ariana_Main_Activity.class);
                        startActivity(newActivity23);
                        break;
                }
            }
        });
//long click sur un item
        listGouvernorat.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                // On récupère la "HashMap" contenant les infos de notre item (titre, description, img)
                HashMap map = (HashMap) listGouvernorat.getItemAtPosition(position);
                // On crée une boite de dialogue
                AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                adb.setTitle("Sélection Item");
                adb.setMessage("Votre choix : " + map.get("titre"));
                adb.setPositiveButton("Ok", null);
                adb.show();
                return true;
            }
        });



    }
}
