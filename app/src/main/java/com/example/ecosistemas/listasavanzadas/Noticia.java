package com.example.ecosistemas.listasavanzadas;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Noticia {

    private String titulo;
    private String descripcion;
    private String fecha;
    //private String urlImg;


    public Noticia(String titulo, String descripcion, String fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }
}
