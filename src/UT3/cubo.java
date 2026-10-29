package UT3;

import java.util.Scanner;

//Implementa un método que, dado un número entero, calcule el cubo
public class cubo {
    static void main() {
        Scanner teclado = new Scanner(System.in);;
        System.out.println("Dame un numero para calcular su cubo");
        int a = teclado.nextInt();
        while (a !=0) {
            Cubo(a);
            a= teclado.nextInt();
        }
    }

    private static void Cubo(int a) {
        int cubo = a*a*a;
        System.out.println("El cubo de "+a+" es "+cubo);
    }
}
