package com.uts_10119263_ridwanramadhan.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.uts_10119263_ridwanramadhan.R;
import com.uts_10119263_ridwanramadhan.ViewPage.CatatanApp;
import com.uts_10119263_ridwanramadhan.ViewPage.DeveloperApp;
import com.uts_10119263_ridwanramadhan.ViewPage.InfoApp;

//IDENTITAS PENGERJAAN TUGAS :
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7

public class MainView extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    CatatanApp catatanApp = new CatatanApp();
    InfoApp infoApp = new InfoApp();
    DeveloperApp developerApp = new DeveloperApp();

    EditText date, judul, kategori, catatan;
    Button insert, update, delete, view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.menu);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, developerApp).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.catatan:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, catatanApp).commit();
                        return true;
                    case R.id.profile_dev:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, developerApp).commit();
                        return true;
                    case R.id.informasi_app:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, infoApp).commit();
                        return true;
                }
                return false;
            }
        });
    }

    public void Logout(View view) {
        Intent intent = new Intent(MainView.this, MainView.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(MainView.this, MainView.class);
        startActivity(intent);
    }
}