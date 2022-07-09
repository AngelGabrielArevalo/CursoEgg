
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un número:");
        double num1=entrada.nextDouble();
        System.out.println("Ingrese un número:");
        double num2=entrada.nextDouble();
        System.out.println("La suma de los números ingresados es: " + (num1+num2));
    }

}
