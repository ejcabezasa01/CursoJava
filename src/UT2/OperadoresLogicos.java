package UT2;

public class OperadoresLogicos {
    static void main() {
        int a = 1, b = 2;
        boolean condicion1=false, condicion2=true;
        boolean resultado2 = a > b;

        //&& = and / true = true && true
        boolean resultado = condicion1 && condicion2;
        System.out.println(resultado);

        //|| = or / true = true cuando uno de los dos es verdadero
         resultado = condicion1 || condicion2;
        System.out.println(resultado);

        //! = not  !false = true / !true = false
        condicion1=!condicion1;
        System.out.println(condicion1);


    } //fin main
}
