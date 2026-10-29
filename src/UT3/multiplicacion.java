package UT3;

import java.util.Scanner;

public class multiplicacion {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserta dos numeros: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        multiplicar (a, b);
    }

    private static void multiplicar(int a, int b) {
       int c = a*b;
        System.out.println("El total es: "+c);
    }
}
