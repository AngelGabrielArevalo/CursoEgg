
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados que desea convertir: ");
        double grados_cent=entrada.nextDouble();
        System.out.println(grados_cent+"°C equivalen a "+(32+(9*(grados_cent/5)))+"°F");
    }

}
