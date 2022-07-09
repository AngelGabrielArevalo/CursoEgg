
package ejercicio09.servicios;

import ejercicio09.entidades.Raices;
import java.util.Scanner;

public class ServicioRaices {
    Scanner entrada=new Scanner(System.in);
    
    public Raices crearRaices(){
        System.out.println("Ingrese el valor de a:");
        double a=entrada.nextDouble();
        System.out.println("Ingrese el valor de b:");
        double b=entrada.nextDouble();
        System.out.println("Ingrese el valor de c:");
        double c=entrada.nextDouble();
        return new Raices(a, b, c);
    }
}
