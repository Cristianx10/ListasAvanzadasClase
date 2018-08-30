package com.example.ecosistemas.listasavanzadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv_noticias;
    private NoticiaAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customAdapter = new NoticiaAdapter(this);

        lv_noticias = findViewById(R.id.lv_noticias);
        lv_noticias.setAdapter(customAdapter);

        Noticia noticia1 = new Noticia("Hoy es design","De los 56.400 sumideros que hay en Cali, entre el 70 % y el 80 % generan zancudos, sin embargo, hay 312 en los que se concentra la mayor cantidad de producción de los vectores, causantes de enfermedades como dengue, zika y chikungunya.","30/08/2018");

        Noticia noticia2 = new Noticia("Hoy es design","De los 56.400 sumideros que hay en Cali, entre el 70 % y el 80 % generan zancudos, sin embargo, hay 312 en los que se concentra la mayor cantidad de producción de los vectores, causantes de enfermedades como dengue, zika y chikungunya.","30/08/2018");

        customAdapter.agregarNoticia(noticia1);
        customAdapter.agregarNoticia(noticia2);

        lv_noticias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Noticia noticia_click = (Noticia) customAdapter.getItem(position);
                Toast.makeText(MainActivity.this, noticia_click.getTitulo(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
