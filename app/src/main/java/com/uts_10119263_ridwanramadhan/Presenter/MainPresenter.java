package com.uts_10119263_ridwanramadhan.Presenter;

import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.uts_10119263_ridwanramadhan.Model.MainModel;
import com.uts_10119263_ridwanramadhan.R;

//IDENTITAS PENGERJAAN TUGAS :
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7

public class MainPresenter implements MainModel.presenter {

    MainModel.view view;

    public MainPresenter(MainModel.view view) {
        this.view = view;
    }

    @Override
    public void SplashScreen() {

    }

    @Override
    public void simpanCatatan(String tanggal, String judul, String kategori, String catatan) {

    }

    @Override
    public void ubahCatatan(String id) {

    }

    @Override
    public void hapusCatatan(String id) {

    }
}