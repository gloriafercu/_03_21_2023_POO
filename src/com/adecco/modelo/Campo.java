package com.adecco.modelo;

public class Campo {
    public int numero;

    public void incrementar() {
        numero++;
    }

    public String mostrarInfo3() {
        return "El valor del número es " + numero;
    }
     public Campo() {
        // constructor vacío
     }
    public Campo(int numero) {
        // constructor un sólo argumento
        this.numero = numero;
    }
}
