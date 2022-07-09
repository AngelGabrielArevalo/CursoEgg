package ejercicio08.servicios;

import ejercicio08.entidades.Cuenta;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioCuenta {
    Scanner entrada=new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        System.out.println("Ingrese número de cuenta:");
        int numeroCuenta=entrada.nextInt();
        System.out.println("Ingrese DNI:");
        long dni=entrada.nextLong();
        System.out.println("Ingrese saldo de la cuenta:");
        double saldo=entrada.nextDouble();
        System.out.println("Ingrese interés anual:");
        double interes=entrada.nextDouble();
        return new Cuenta(numeroCuenta, dni, saldo, interes);
    }
}
