package com.uts_10119263_ridwanramadhan.Model;

//IDENTITAS PENGERJAAN TUGAS :
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7

public interface MainModel {
    interface view {
        void SplashScreen();
        void InformasiApp();
        void onSuccess(String message);
        void onError(String message);
    }

    interface presenter {
        void SplashScreen();
        void simpanCatatan(String tanggal, String judul, String kategori, String catatan);
        void ubahCatatan(String id);
        void hapusCatatan(String id);
    }
}
