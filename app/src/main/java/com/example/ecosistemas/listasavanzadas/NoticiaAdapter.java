package com.example.ecosistemas.listasavanzadas;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NoticiaAdapter extends BaseAdapter {

    ArrayList<Noticia> noticias;
    Activity activity;

    public NoticiaAdapter(Activity activity) {
        this.activity = activity;
        noticias = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return noticias.size();
    }

    @Override
    public Object getItem(int position) {
        return noticias.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = activity.getLayoutInflater();
        //Pasa de xml a View

        View renglon = inflater.inflate(R.layout.renglon, null, false);

        TextView item_titulo = renglon.findViewById(R.id.item_titulo);
        TextView item_fecha = renglon.findViewById(R.id.item_fecha);
        TextView item_descripcion = renglon.findViewById(R.id.item_descripcion);

        Button item_action = renglon.findViewById(R.id.item_action);

        item_titulo.setText(noticias.get(position).getTitulo());
        item_fecha.setText(noticias.get(position).getFecha());
        item_descripcion.setText(noticias.get(position).getDescripcion());

        item_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity, "POS "+position, Toast.LENGTH_SHORT).show();

              /*  noticias.remove(position);
                notifyDataSetChanged();
            */
                Intent intent = new Intent(activity, activity_noticia_view.class);
              activity.startActivity(intent);

              /*

              Intent i = new Intent(MainActivity.this, Noticia_view

               */

            }

        });


        return renglon;
    }

    public void agregarNoticia(Noticia noticia){
        this.noticias.add(noticia);
        notifyDataSetChanged();
    }
}
