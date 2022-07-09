
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera:");
        int alt=entrada.nextInt();
        int i,j;
        for(i=0;i<alt;i++){
            for(j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

}
