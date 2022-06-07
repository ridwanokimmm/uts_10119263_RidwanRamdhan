package com.uts_10119263_ridwanramadhan.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.uts_10119263_ridwanramadhan.Model.MainModel;
import com.uts_10119263_ridwanramadhan.R;
import com.uts_10119263_ridwanramadhan.ViewPage.ModelViewAdapter;

import android.view.View;
import android.widget.Button;

//IDENTITAS PENGERJAAN TUGAS :
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7

public class InformasiApp extends AppCompatActivity implements MainModel.view {

    MainModel.presenter presenter;
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    Button tombol;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.onboardnya);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new ModelViewAdapter(this));

        tombol = (Button)findViewById(R.id.beranda);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(InformasiApp.this, MainView.class);
                startActivity(pindah);
                finish();
            }
        });

    }


    @Override
    public void SplashScreen() {

    }

    @Override
    public void InformasiApp() {


    }

    @Override
    public void onSuccess(String message) {

    }

    @Override
    public void onError(String message) {

    }
}
