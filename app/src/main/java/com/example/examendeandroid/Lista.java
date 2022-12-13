package com.example.examendeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        Datos [] datos = new Datos[]{
                new Datos(R.drawable.ima1,"V 1.6","Donuts es la versión 1.6 de Android"),
                new Datos(R.drawable.ima2,"V 2.2","Froyo es la versión 2.2 de Android"),
                new Datos(R.drawable.ima3,"V 2.3","Gingerbread es la versión 2.3 de Android"),
                new Datos(R.drawable.ima4,"V 3.0","Honeycomb es la versión 3.0 de Android"),
                new Datos(R.drawable.ima5,"V 4.0","Ice Cream  es la versión 4.0 de Android"),
                new Datos(R.drawable.ima6,"V 4.1","Jelly Bean es la versión 4.1 de Android"),
                new Datos(R.drawable.ima7,"V 4.4","KitKat es la versión 4.4 de Android"),
                new Datos(R.drawable.ima8,"V 5.0","Lollipop es la versión 5.0 de Android")
        };

        ListView lista = (ListView) findViewById(R.id.lista);
        Adaptador adaptador = new Adaptador(this,datos);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adaptador, View view, int position, long l) {
                String seleccionado = ((Datos)adaptador.getItemAtPosition(position)).getTexto1();
                Toast.makeText(getApplicationContext(),seleccionado,Toast.LENGTH_LONG).show();
            }
        });


    }
}