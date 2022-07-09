
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio32 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del cuadrado:");
        int n=entrada.nextInt();
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0 || i==n-1){
                    System.out.print("*");
                }
                else{
                    if(j==0 || j==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
