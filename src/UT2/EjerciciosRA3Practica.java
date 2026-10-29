package UT2;

import java.util.Scanner;

public class EjerciciosRA3Practica {
    static void main() {
        //ejercicio1();
        //ejercicio2();
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i<=10; i++){
            System.out.println(2*i);
        }
    }










    private static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero");
        int b = teclado.nextInt();
        String menu = "\n 1: Consultar notas" + "\n 2: Mostrar alumnos" + "\n 3: Registrar asistencia"
                + "\n 4: Salir";
        switch (b) {
            case 1: System.out.println(menu);
                break;
            case 2:
                System.out.println(menu);
                break;
            case 3:
                System.out.println(menu);
                break;
            case 4:
                System.out.println(menu);
                break;
            default:
                System.out.println("error");
        }
    }


    private static void ejercicio1() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int a = teclado.nextInt();

        if (a > 0){
            System.out.println("Es positivo");
        }
        if (a == 0){
            System.out.println("Es cero");
        }
        if (a<0){
            System.out.println("Es negativo");
        }
    }
}
