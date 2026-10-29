package UT2;

import java.util.Scanner;

public class Ej3ApuntesDoWhile {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int num;
        int resultado = 0;
        String cadenaSuma = " ";
        do {
            System.out.print("Introduce un numero:");
            num = teclado.nextInt();
            if (num > 0) {
                resultado = num + resultado;
                cadenaSuma=cadenaSuma+""+num+" + ";
            }
        }while (num > 0) ;
            System.out.println("Resultado = "+ cadenaSuma + " \b\b\b= " + resultado);

    }
}