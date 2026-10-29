package UT2;

import java.util.Scanner;

public class EjemploLogin_if_switch {
    static void main() {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre de usuario");
        String user=teclado.nextLine();


        switch (user){
            case "admin":
                System.out.println("Puedes acceder como administrador");break;
            case "user":
                System.out.println("Puedes acceder como usuario");break;
            default:
                System.out.println("error");break;
        }



        //parte_if(user);
    }

    private static void parte_if(String user) {
        if (user.equals("admin")) {
            System.out.println("Puedes entrar como administrador");
        }else if (user.equals("user")){
                System.out.println("puedes entrar como usuario");
            }else{
                System.out.println("error");
        }
    }

}

