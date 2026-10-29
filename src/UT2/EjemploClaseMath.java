package UT2;

public class EjemploClaseMath {
    static void main() {
        //int x = 16;

        //double resultado = Math.sqrt(x);
       // System.out.println(resultado);


       // System.out.println(Math.pow(10,3));

        //sout = atajo para poner system.out.println

       // double y = 3.8;
       // System.out.println(Math.round(y));
       // System.out.println(Math.ceil(y));
       // System.out.println(Math.floor(y));

        //Dado el radio de una circunferencia quiero calcular la longitud y el área de la misma
        //Pasos: calcular el área dado el radio

        double radio = 5.0;
                double longitud =  2 * Math.PI * radio;
        System.out.println("La Longitud es: "+longitud);
        double area = Math.PI * radio * radio;
        System.out.println("El área es: "+area);

    }
}
