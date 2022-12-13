package com.example.examendeandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adaptador extends ArrayAdapter {

    private Datos [] datos;

    public Adaptador(@NonNull Context context, Datos [] datos ) {
        super(context, R.layout.elemento,datos);
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mostrado = LayoutInflater.from(getContext());
        View elemento = mostrado.inflate(R.layout.elemento,null,false);

        ImageView imagen = (ImageView) elemento.findViewById(R.id.imagen);
        imagen.setImageResource(datos[position].getImagen());

        TextView texto1 = (TextView) elemento.findViewById(R.id.texto1);
        texto1.setText(datos[position].getTexto1());

        TextView texto2 = (TextView) elemento.findViewById(R.id.texto2);
        texto2.setText(datos[position].getTexto2());

        return elemento;
    }
}
