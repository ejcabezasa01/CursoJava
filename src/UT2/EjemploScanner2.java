package UT2;

import java.util.Scanner;

public class EjemploScanner2 {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número");

        while (teclado.hasNextInt()) {
            int numero = teclado.nextInt();
            System.out.println("Numero introducido: " + numero);
        }
    }
}
