package com.adecco.modelo;

/* Aquí creamos la clase Coche, es como si fuera una plantilla para crear objetos nuevos Coche
*  en donde queramos re-utilizar este código */
public class Coche {
    // CREACIÓN DE ATRIBUTOS
    public String marca;
    public double precio;
    public int anio;
    public String color;

    // CREACIÓN DE MÉTODOS
    // 1.a.- métodos que no devuelven un resultado (con void, no hay return)
    public void mostrarInfo() {
        System.out.println("Marca: " + marca); // no tengo que decirle que marca, pq estoy en la propia clase
        System.out.println("Precio: " + precio);
        System.out.println("Color: " + color);
        System.out.println("Año: " + anio);
    }
    // 1.b.- métodos que devuelven un resultado (dentro del método existe un return)
    public String mostrarInfo2() {
        return "Marca: " + marca + ", precio: " + precio + ", color: " + color + ", año: " + anio;
    }

    // CREACIÓN DEL CONSTRUCTOR: sino hay constructor al compilarse se construye automáticamente pero vacío
    // Los constructores no se pueden llamar igual por lo tanto se tienen que diferenciar en el número de parámetros
    public Coche() {
        // constructor vacío
    }
    public Coche(String pMarca, double precio) {
        // nuevo constructor, ahora no está vacío: tiene 2 parámetros
        marca = pMarca; // se lee de derecha a izquierda, se asigna el valor de la izq al parámetro de la drcha
        this.precio = precio;
    }

    public Coche(String marca, double precio, int anio, String color ) {
        // nuevo constructor, ahora no está vacío: tiene 4 parámetros
        this.marca = marca;
        this.precio = precio;
        this.anio = anio;
        this.color = color;
    }
    // como hay varios constructores esto se conoce como SOBRECARGA

}
