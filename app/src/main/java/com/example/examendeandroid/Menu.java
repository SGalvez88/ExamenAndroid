package com.example.examendeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton bontonWeb = (ImageButton) findViewById(R.id.imageButtonWeb);
        ImageButton botonVersiones = (ImageButton) findViewById(R.id.imageButtonVersiones);
        ImageButton botonBarra = (ImageButton) findViewById(R.id.imageButtonBarra);
        Button botonvolver  = (Button) findViewById(R.id.botonVolver);

        bontonWeb.setOnClickListener(this);
        botonVersiones.setOnClickListener(this);
        botonBarra.setOnClickListener(this);
        botonvolver.setOnClickListener(this);

        TextView textViewVersion = (TextView) findViewById(R.id.textViewVersion);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                switch (progress){
                    case 0:
                        textViewVersion.setText("Tu version de android es la Donuts");
                        break;
                    case 1:
                        textViewVersion.setText("Tu version de android es la Froyo");
                        break;
                    case 2:
                        textViewVersion.setText("Tu version de android es la Gingerbread");
                        break;
                    case 3:
                        textViewVersion.setText("Tu version de android es la Honeycomb");
                        break;
                    case 4:
                        textViewVersion.setText("Tu version de android es la Ice Cream");
                        break;
                    case 5:
                        textViewVersion.setText("Tu version de android es la Jelly Bean");
                        break;
                    case 6:
                        textViewVersion.setText("Tu version de android es la KitKat");
                        break;
                    case 7:
                        textViewVersion.setText("Tu version de android es la Lollipop");
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButtonWeb:
                Intent web = new Intent(Intent.ACTION_VIEW);
                Uri uri = Uri.parse("https://developer.android.com");
                web.setData(uri);
                startActivity(web);
                break;
            case R.id.imageButtonVersiones:
                Intent lista = new Intent(getApplicationContext(),Lista.class);
                startActivity(lista);
                break;
            case R.id.imageButtonBarra:
                TextView tituloVersion = (TextView) findViewById(R.id.textViewTituloVersion);
                TextView versionElegida = (TextView) findViewById(R.id.textViewVersion);
                Button botonVolver = (Button) findViewById(R.id.botonVolver);
                SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);

                tituloVersion.setVisibility(View.VISIBLE);
                versionElegida.setVisibility(View.VISIBLE);
                botonVolver.setVisibility(View.VISIBLE);
                seekBar.setVisibility(View.VISIBLE);
                break;
            case R.id.botonVolver:
                Intent volver = new Intent(getApplicationContext(),Menu.class);
                startActivity(volver);
                break;
        }
    }
}