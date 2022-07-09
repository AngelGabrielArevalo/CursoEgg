
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int n=entrada.nextInt();
        int[] vec=new int[n];
        int i;
        int suma=0;
        for(i=0;i<n;i++){
            System.out.println("Ingrese el valor del vector en la posición "+i);
            vec[i]=entrada.nextInt();
            suma+=vec[i];
        }
        System.out.println("La suma de los elementos del vector es "+suma);
    }

}
