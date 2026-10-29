package UT2;

import java.util.Scanner;

public class Ej1Frigura {
    static void main() {
        //sin_modificar();

        //mal

        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduce la base ");
        int base = teclado.nextInt();
        System.out.print("Introduce la altura ");
        int altura = teclado.nextInt();
        for (int fila = 0; fila <= altura; fila++){
            for (int columna = 0; columna <= base; columna++){
                if (fila == 1 || fila == altura|| columna ==1 || columna==base){
                    System.out.print("*");
                }else{
                    System.out.println(" ");
                }
                System.out.println();
            }
        }
    }



    private static void sin_modificar() {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduce la base ");
        int base = teclado.nextInt();
        System.out.print("Introduce la altura ");
        int altura = teclado.nextInt();
        for (int fila = 0; fila < altura; fila++){
            for (int columna = 0; columna < base; columna++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}


