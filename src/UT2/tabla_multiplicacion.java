package UT2;

import java.util.Scanner;

public class tabla_multiplicacion {
    static void main() {
        //Tabla_Multiplicar_1Numero();

        System.out.println("Tabla de multiplicar (Bucle FOR)");
        for (int num = 1;num<=10;num++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }















    private static void Tabla_Multiplicar_1Numero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();

        System.out.println("Tabla de multiplicar (Bucle FOR)");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println("Tabla de multiplicar (Bucle WHILE)");
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num* i));
            i++;
        }
        System.out.println("Tabla de multiplicar (Bucle DO-WHILE)");
        i = 1;
        do {
            System.out.println(num+ " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }


}

