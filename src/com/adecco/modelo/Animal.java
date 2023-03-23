package com.adecco.modelo;

public class Animal {
    // 1. Atributo
    public int numPatas;
    public String color;
    public String especie;
    public boolean peligroExtincion;

    // 2. Método
    public String comer() {
        return "El animal está comiendo...";
    }
    public String comer(String alimento) {
        // SOBRECARGA SOBRE UN MÉTODO
        return "El animal está comiendo " + alimento;
    }
    public String correr(double km) {
        return "El animal está corriendo " + km + " kilómetros";
    }
    public String mostrarInfo() {
        return "Número de patas: " + numPatas + ", color: " + color + ", especie: " + especie
                + " ¿Peligro de extinción?: " + peligroExtincion;
    }
    // 3. Constructores
    // constructor vacío
    public Animal() {

    }
    // constructor completo
    public Animal(int numPatas, String color, String especie, boolean peligroExtincion) {
        this.numPatas = numPatas;
        this.color = color;
        this.especie = especie;
        this.peligroExtincion = peligroExtincion;
    }
}
