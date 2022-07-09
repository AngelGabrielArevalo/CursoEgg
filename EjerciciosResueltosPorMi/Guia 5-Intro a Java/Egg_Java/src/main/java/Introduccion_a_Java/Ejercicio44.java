
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio44 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector:");
        int n=entrada.nextInt();
        int[] vec=new int[n];
        rellenarvector(vec, n);
        mostarvector(vec, n);
    }
    
    public static void rellenarvector(int[] vec, int n){
        int i;
        for(i=0;i<n;i++){
            vec[i]=(int)(Math.random()*101);
        }
    }
    
    public static void mostarvector(int[] vec, int n){
        int i;
        for(i=0;i<n;i++){
            System.out.println(vec[i]);        
        }
    }
}
