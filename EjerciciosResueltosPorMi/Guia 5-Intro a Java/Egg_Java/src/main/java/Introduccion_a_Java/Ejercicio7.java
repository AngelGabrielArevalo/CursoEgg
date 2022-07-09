
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num=entrada.nextInt();
        System.out.println("El doble del número ingresado es: "+(num*2));
        System.out.println("El triple del número ingresado es: "+(num*3));
        System.out.println("La raiz cuadrada del número ingresado es: "+Math.sqrt(num));
    }
}
