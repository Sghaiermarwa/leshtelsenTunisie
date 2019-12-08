package com.example.leshtelsentunisie;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    protected ListView listGouvernorat;
    private String msg;
    private SimpleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ce message  etre afficher dans un toast comme
        // une remarque car j'ai ralisé seulement les interface deu Arian,Beja,Benarous
        msg=getString(R.string.msg);

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
        adapter = new SimpleAdapter(this.getBaseContext(),
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
                        Toast ToastMessage = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView = ToastMessage.getView();
                        toastView.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage.show();
                        break;
                    case 4:
                        Toast ToastMessage2 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView2 = ToastMessage2.getView();
                        toastView2.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage2.show();
                        break;
                    case 5:
                        Toast ToastMessage3 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView3 = ToastMessage3.getView();
                        toastView3.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage3.show();
                        break;
                    case 6:
                        Toast ToastMessage4 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView4 = ToastMessage4.getView();
                        toastView4.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage4.show();
                        break;
                    case 7:
                        Toast ToastMessage5 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView5 = ToastMessage5.getView();
                        toastView5.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage5.show();
                        break;
                    case 8:
                        Toast ToastMessage6 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView6 = ToastMessage6.getView();
                        toastView6.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage6.show();
                        break;
                    case 9:
                        Toast ToastMessage7 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView7 = ToastMessage7.getView();
                        toastView7.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage7.show();
                        break;
                    case 10:
                        Toast ToastMessage8 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView8 = ToastMessage8.getView();
                        toastView8.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage8.show();
                        break;
                    case 11:
                        Toast ToastMessage9 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView9 = ToastMessage9.getView();
                        toastView9.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage9.show();
                        break;
                    case 12:
                        Toast ToastMessage10 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView10 = ToastMessage10.getView();
                        toastView10.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage10.show();
                        break;
                    case 13:
                        Toast ToastMessage11 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView11 = ToastMessage11.getView();
                        toastView11.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage11.show();
                        break;
                    case 14:
                        Toast ToastMessage12 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView12 = ToastMessage12.getView();
                        toastView12.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage12.show();
                        break;
                    case 15:
                        Toast ToastMessage13 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView13 = ToastMessage13.getView();
                        toastView13.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage13.show();
                        break;
                    case 16:
                        Toast ToastMessage14 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView14 = ToastMessage14.getView();
                        toastView14.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage14.show();
                        break;
                    case 17:
                        Toast ToastMessage15 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView15 = ToastMessage15.getView();
                        toastView15.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage15.show();
                        break;
                    case 18:
                        Toast ToastMessage16 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView16 = ToastMessage16.getView();
                        toastView16.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage16.show();
                        break;
                    case 19:
                        Toast ToastMessage17 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView17 = ToastMessage17.getView();
                        toastView17.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage17.show();
                        break;
                    case 20:
                        Toast ToastMessage18 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView18 = ToastMessage18.getView();
                        toastView18.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage18.show();
                        break;
                    case 21:
                        Toast ToastMessage19 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView19 = ToastMessage19.getView();
                        toastView19.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage19.show();
                        break;
                    case 22:
                        Toast ToastMessage20 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView20 = ToastMessage20.getView();
                        toastView20.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage20.show();
                        break;
                    case 23:
                        Toast ToastMessage21 = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                        View toastView21 = ToastMessage21.getView();
                        toastView21.setBackgroundColor(R.layout.toast_background_color);
                        ToastMessage21.show();
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
