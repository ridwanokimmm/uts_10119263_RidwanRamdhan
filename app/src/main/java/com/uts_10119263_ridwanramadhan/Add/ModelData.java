package com.uts_10119263_ridwanramadhan.Add;

//IDENTITAS PENGERJAAN TUGAS :
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7

public class ModelData {

    int id;
    private String title;
    private String kategori;
    private String catatan;
    private String date;
    private String time;

    ModelData(int id, String title, String kategori, String catatan, String date, String time) {
        this.id = id;
        this.title = title;
        this.kategori = kategori;
        this.catatan = catatan;
        this.date = date;
        this.time = time;
    }

    int getId() {
        return id;
    }

    String getTitle() {
        return title;
    }

    String getKategori() {return kategori;}

    String getCatatan() {
        return catatan;
    }

    String getDate() {
        return date;
    }

    String getTime() {
        return time;
    }

}
