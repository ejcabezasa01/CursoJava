package UT2;

import java.util.Scanner;

public class Ej4Apuntes {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i>0;){
            System.out.print("introduce un numero: ");
            i = teclado.nextInt();
            int nCifras = i/10;
            nCifras++;
        }
    }
}
