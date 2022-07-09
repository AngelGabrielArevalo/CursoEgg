
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        double horas=entrada.nextDouble();
        System.out.println("Ingrese el valor por hora trabajada: ");
        double valor=entrada.nextDouble();
        System.out.println("Su salario es: $"+(horas*valor));
                
    }

}
