package com.example.examendeandroid;

public class Datos {
    private int imagen;
    private String texto1;
    private String texto2;

    public Datos(int imagen, String texto1, String texto2) {
        this.imagen = imagen;
        this.texto1 = texto1;
        this.texto2 = texto2;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTexto1() {
        return texto1;
    }

    public String getTexto2() {
        return texto2;
    }
}
