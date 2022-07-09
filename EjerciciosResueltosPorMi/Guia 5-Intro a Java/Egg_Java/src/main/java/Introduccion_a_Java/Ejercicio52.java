
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio52 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de sucesiones que desea visualizar:");
        int n=entrada.nextInt();
        int[] vec=new int[n];
        int i;
        for(i=0;i<n;i++){
            vec[i]=fibonacci(i);
        }
        mostrarvector(vec, n);
    }
    
    public static int fibonacci(int n){
        int resultado;
        if(n<=1){
            resultado=1;
        }
        else{
            resultado=fibonacci(n-1)+fibonacci(n-2);
        }
        return resultado;
    }

    public static void mostrarvector(int[] vec, int n){
        int i;
        for(i=0;i<n;i++){
            System.out.print(vec[i]+"  ");
        }
        System.out.println("");
    }
}
