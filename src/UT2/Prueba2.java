package UT2;

public class Prueba2 {
    static void main() {
        String nada = ""; //cadena vacía
        String nombre = "Pepe";
        String apellido = "Martínez";
        String nombreCompleto1 = nombre + apellido; //PepeMartínez
        String nombreCompleto2 = nombre + " " + apellido; //Pepe Martínez

        System.out.println(nada);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombreCompleto1);
        System.out.println(nombreCompleto2);
    }
}
