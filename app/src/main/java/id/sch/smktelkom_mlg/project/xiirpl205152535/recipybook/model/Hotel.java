package id.sch.smktelkom_mlg.project.xiirpl205152535.recipybook.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Anisa_anisa on 04/11/2016.
 */

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}

