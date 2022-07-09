
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre=entrada.nextLine();
        System.out.println("Hola "+nombre);
    }

}
