package com.example.recycler.models;


public class Gallo extends Animal {

    private String Nombre;
    private String Raza;
    private com.example.recycler.models.Pico Pico;

    public Gallo(String nombre, String raza, com.example.recycler.models.Pico pico) {
        Nombre = nombre;
        Raza = raza;
        Pico = pico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public com.example.recycler.models.Pico getPico() {
        return Pico;
    }

    public void setPico(com.example.recycler.models.Pico pico) {
        Pico = pico;
    }
}
