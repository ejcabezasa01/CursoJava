package UT2;

import java.util.Scanner;

public class EjemploSwitch {
/*
utilizando el swith quiero que muestre el nombre del día
 de la semana, o que te has equivocado, según el número introducido
 */
static void main() {
    Scanner teclado =new Scanner(System.in);
    System.out.println("Introduce un numero");
    int dia = teclado.nextInt();

    switch (dia) {
        case 1:
            System.out.println("Es lunes");
            break;
        case 2:
            System.out.println("Es Martes");
            break;
        case 3:
            System.out.println("es Miércoles");
            break;
        case 4:
            System.out.println("Es Jueves");
            break;
        case 5:
            System.out.println("Es Viernes");
            break;
        case 6:
            System.out.println("Es sábado");
            break;
        case 7:
            System.out.println("Es Domingo");
            break;
        default:
            System.out.println("No existe ese dia");
    }

}
}
