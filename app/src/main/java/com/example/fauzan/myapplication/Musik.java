package com.example.fauzan.myapplication;

public class Musik {
    public String judul;
    public String artis;
    public String url;
    public String deskripsi;
    public int cover;

    public Musik(String judul, String artis,String url, String deskripsi, int cover){
        this.judul = judul;
        this.artis = artis;
        this.url = url;
        this.deskripsi = deskripsi;
        this.cover = cover;
    }

    public Musik(String judul, String artis, int cover){
        this.judul = judul;
        this.artis = artis;
        this.cover = cover;
    }
}
