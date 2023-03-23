package com.example.parcial2;

public class Cargo {
    private String nombre;
    private char genero;
    public Cargo(String nombre, char genero) {
        this.nombre=nombre;
        this.genero=genero;
    }
    public String getNombre() {
        return nombre;
    }
    public char getGenero() {
        return genero;
    }
}
