package com.adecco.presentacion;

import com.adecco.modelo.Animal;
import com.adecco.modelo.Campo;
import com.adecco.modelo.Coche;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        variables();
        metodo_poo();
        crearObjetosAnimal();
        incrementarNumero();
    }

    private static void incrementarNumero() {
        Campo c1 = new Campo();
        c1.numero = 4;
        c1.incrementar();
        System.out.println(c1.mostrarInfo3());
        System.out.println("--------");
        Campo c2 = new Campo(7);
        c2.incrementar();
        System.out.println(c2.mostrarInfo3());
    }


    private static void crearObjetosAnimal() {
        /* Crear un objeto o instanciar la clase */
        Animal a1 = new Animal();
        a1.numPatas = 4;
        a1.color = "Negro";
        a1.especie = "Mamífero";
        a1.peligroExtincion = false;

        System.out.println(a1.comer());
        System.out.println(a1.correr(2));
        System.out.println(a1.mostrarInfo());

        Animal a2 = new Animal();
        a2.numPatas = 2;
        a2.color = "Blanco";
        a2.especie = "Ave";
        a2.peligroExtincion = false;

        System.out.println(a2.comer());
        System.out.println(a2.comer("Verdura"));
        System.out.println(a2.correr(5));
        System.out.println(a2.mostrarInfo());

        Animal a3 = new Animal();
        a3.numPatas = 4;
        a3.color = "Negro";
        a3.especie = "Elefante";
        a3.peligroExtincion = true;
        System.out.println(a3.mostrarInfo());

        Animal a4 = new Animal(8,"Negra", "Araña",true);
        System.out.println(a4.mostrarInfo());
    }

    private static void metodo_poo() {
        /* Crear un objeto (instanciar la clase) */

        // c1 es el nombre del objeto Coche, igual que a las variables se las da un nombre
        // new Coche() es el constructor de la clase Coche

        Coche c1 = new Coche();
        c1.marca = "Toyota";
        c1.color = "Gris";
        c1.precio = 60_000.0;
        c1.anio = 2023;
       /* System.out.println("La marca del coche c1 es -> " + c1.marca);
        System.out.println("El color del coche c1 es -> " + c1.color);
        System.out.println("El precio del coche c1 es -> " + c1.precio);
        System.out.println("El año del coche c1 es -> " + c1.anio);
        */
        c1.mostrarInfo(); // Ahora llamamos a método y obtenemos la misma información
        System.out.println(c1.mostrarInfo2());

        Coche c2 = new Coche();
        c2.marca = "Renault";
        c2.color = "Verde";
        c2.precio = 67_000;
        c2.anio = 2022;
        /* System.out.println("La marca del coche c2 es -> " + c2.marca);
        System.out.println("El color del coche c2 es -> " + c2.color);
        System.out.println("El precio del coche c2 es -> " + c2.precio);
        System.out.println("El año del coche c2 es -> " + c2.anio);*/
        c2.mostrarInfo(); // Ahora llamamos a método y obtenemos la misma información
        System.out.println(c2.mostrarInfo2());

        Coche c3 = new Coche("Seat", 45000);
        System.out.println(c3.mostrarInfo2());

        Coche c4 = new Coche("Hyundai", 56000, 2021,"Blanco");
        System.out.println(c4.mostrarInfo2());
    }

    private static void variables() {
        /*   TIPOS DE VARIABLES */

        // 1.- Tipo de variables ENTERAS (dentro de la clase es un ATRIBUTO)
        byte vByte = 7; // Es un entero que contiene la información que quepa en 1 byte
        short vShort = 123;
        int vInt = 123_123; // 1 byte (el guión nos señala los miles, sino se pone no pasa nada)
        long vLong = 123_123L; // 8 bytes (sino pones la L te lo interpreta como un integer)
        // 2.- Tipo de variables DECIMALES (dentro de la clase es un ATRIBUTO)
        float vFloat = 123.45F; // 4 bytes (hay que indicarle la f o F pq sino da error)
        double vDouble = 123_123.898; // 8 bytes
        char vChar = 'c'; // con comillas sencillas '' (sólo un caracter)
        // 3. Tipo de variables BOOLEANAS
        boolean vBoolean = false;

        System.out.println("Valor de variable byte " + vByte);
        System.out.println("Valor de variable short " + vShort);
        System.out.println("Valor de variable int " + vInt);
        System.out.println("Valor de variable long " + vLong);

        /* STRING: no es un tipo primitivo, es una CLASE */
        String vString = "Hola mundo";
        System.out.println(vString);

        /* CLASES ENVOLVENTES: Cuando queremos convertir un tipo primitivo en objeto.
        * Se representa igual que el dato primitivo pero la primera letra en mayúscula (excepto Integer y Character).
        * Ejemplo: cuando tenemos un dato nulo en una base de datos pero nuestra variable es de tipo integer,
        * un integer no puede aceptar un número nulo y dará error, si lo convierto en objeto con la clase envolvente Integer,
        * este objeto ahora si aceptará int y valores nulos.
        */

        Integer vInteger = 500;
        System.out.println("Tipo envolvente de int -> Integer " + vInteger);
        Character vCharacter = 'c';
        System.out.println("Tipo envolvente de char -> Character " + vCharacter);
        Byte vByteE = 5;
        System.out.println("Tipo envolvente de byte -> Byte " + vByteE);
    }

}

