package UT2;

import java.util.Scanner;

public class Ej2Apuntes {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        int contadorDigitos = 0;

        if (numero == 0) {
            contadorDigitos = 1;
        } else {
            while (numero > 0) {
                numero = numero / 10;
                contadorDigitos++;
            }
        }
        System.out.println("El número tiene " + contadorDigitos + " dígito(s)");
    }
}