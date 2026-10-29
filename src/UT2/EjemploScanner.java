package UT2;

import java.util.Scanner;

public class EjemploScanner {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Escribe tus apellidos");
        String apellidos = teclado.nextLine();
        System.out.println("Tu nombre es: "+nombre+" "+apellidos);

    }
}
