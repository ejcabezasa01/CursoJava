package UT2;

import java.util.Scanner;

public class Ej1Apuntes {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números: ");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, introduce un número mayor que 0.");
            teclado.close();
            return;
        }

        int[] numeros = new int[n];

        System.out.println("Introduce los " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        int contadorMayor = 0;
        int contadorMenor = 0;

        for (int i = 0; i < n; i++) {
            // Comprobaciones para el mayor
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                contadorMayor = 1;
            } else if (numeros[i] == mayor) {
                contadorMayor++;
            }
            // Comprobaciones para el menor
            if (numeros[i] < menor) {
                menor = numeros[i];
                contadorMenor = 1;
            } else if (numeros[i] == menor) {
                contadorMenor++;
            }
        }
        System.out.println("RESULTADOS");
        System.out.println("El número mayor es: " + mayor + " (aparece " + contadorMayor + " vez/veces)");
        System.out.println("El número menor es: " + menor + " (aparece " + contadorMenor + " vez/veces)");
    }
}
