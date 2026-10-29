package UT2;

import java.util.Scanner;

public class EjemploCondiciones {
    static void main() {
        //ejercicio_if_1();
    /*
    Lee el nombre y edad de una persona que quiere entrar en una discoteca
    para decirle "nombre" puedes entrar porque eres mayor de edad o no
     */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escibe tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Indica tu edad");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println(nombre + ", puedes entrar porque eres mayor de edad, " +
                    "tienes " + edad +" años");
        } else
            System.out.println(nombre + ", no puedes entrar porque eres menor de edad, " +
                    "tienes " + edad + " años");
    }









    private static void ejercicio_if_1() {
    /* Declarar una varialble x con un valor inicial
    Si x = 3 incremento en 1 x
    Si no decremento en 1 x
     */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número");
        int x = teclado.nextInt();
        if (x==3) {
            x++;
        } else {
            x--;
        }
        System.out.println(x);
    }
}
