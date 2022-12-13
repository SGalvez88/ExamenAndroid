package com.example.examendeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ETUsuario = (EditText) findViewById(R.id.edituser);
        EditText ETPassword = (EditText) findViewById(R.id.editpassword);
        TextView textoUsurio = (TextView) findViewById(R.id.textViewUser);
        TextView textoPassword = (TextView) findViewById(R.id.textViewPassword);
        Button botonLogin = (Button) findViewById(R.id.botonLogin);

        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = ETUsuario.getText().toString();
                String password = ETPassword.getText().toString();

                if(usuario.equals("ADMIN") && password.equals("1234")){
                    Intent menu = new Intent(getApplicationContext(),Menu.class);
                    startActivity(menu);
                }else if(!usuario.equals("ADMIN") && password.equals("1234")){
                    textoUsurio.setVisibility(View.VISIBLE);
                    textoPassword.setVisibility(View.VISIBLE);
                }else if(usuario.equals("ADMIN") && !password.equals("1234")){
                    textoPassword.setVisibility(View.VISIBLE);
                }else{
                    textoUsurio.setVisibility(View.VISIBLE);
                    textoPassword.setVisibility(View.VISIBLE);
                }
            }
        });

        ETUsuario.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(textoUsurio.isCursorVisible() && textoPassword.isCursorVisible()){
                    textoUsurio.setVisibility(View.INVISIBLE);
                    textoPassword.setVisibility(View.INVISIBLE);
                }
                return false;
            }
        });

        ETPassword.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(textoPassword.isCursorVisible()){
                    textoPassword.setVisibility(View.INVISIBLE);
                }
                return false;
            }
        });
    }
}