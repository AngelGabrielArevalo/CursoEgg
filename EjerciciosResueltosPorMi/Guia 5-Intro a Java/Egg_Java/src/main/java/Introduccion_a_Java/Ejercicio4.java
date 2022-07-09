
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase=entrada.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }

}
