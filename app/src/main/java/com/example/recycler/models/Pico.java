package com.example.recycler.models;

public class Pico {

    private  String Tamano;
    private String Color;

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String tamano) {
        Tamano = tamano;
    }

    public Pico(String tamano, String color) {
        Tamano = tamano;
        Color = color;
    }


    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
