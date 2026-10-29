package UT3;

import java.util.Scanner;

//Implementa un método que, dado un nombre, muestre un saludo.
public class saludo {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = teclado.nextLine();
        Saludar(nombre);

    }

    private static void Saludar(String nombre) {
        System.out.println("Hola "+nombre);
    }


}
