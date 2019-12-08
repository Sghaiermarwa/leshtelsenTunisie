package com.example.leshtelsentunisie;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class  MainActivityFirstInterface extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_first_interface);




        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }

        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
//dans cette fonction j'ai fait la gestion de chaque item de menu
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        int id =menuItem.getItemId();
                        if ((id==R.id.nav_SignIn)){
                            Intent newActivity = new Intent(MainActivityFirstInterface.this,SignIn.class);
                            startActivity(newActivity);
                        }
                        else  if ((id==R.id.nav_SignUP)){
                            Intent newActivity = new Intent(MainActivityFirstInterface.this,Signup.class);
                            startActivity(newActivity);}
                        else  if ((id==R.id.nav_propos)){
                            Intent newActivity = new Intent(MainActivityFirstInterface.this,propos.class);
                            startActivity(newActivity);}


                        return true;
                    }
                });
        Toast.makeText(this, getString(R.string.messagenav), Toast.LENGTH_LONG).show();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            mDrawerLayout.openDrawer(GravityCompat.START);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

