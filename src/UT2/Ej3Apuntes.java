package UT2;

import java.util.Scanner;


public class Ej3Apuntes {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int suma = 0;
        String expresion = "";
        boolean primerElemento = true;


        System.out.println("Introduce números: ");


        while (true) {
            System.out.print("Número: ");
            int numero = teclado.nextInt();
            if (numero <= 0) {
                break;
            }
            suma += numero;


            if (primerElemento) {
                expresion += numero;
                primerElemento = false;
            } else {
                expresion += "+" + numero;
            }
        }
        if (!primerElemento) {
            System.out.println("\nSuma: " + expresion + "=" + suma);
        } else {
            System.out.println("\nNo se introdujo ningún número válido.");
        }
    }
}
