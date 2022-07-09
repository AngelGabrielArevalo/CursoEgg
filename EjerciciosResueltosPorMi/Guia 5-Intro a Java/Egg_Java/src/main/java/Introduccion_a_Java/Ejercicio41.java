
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio41 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores:");
        int n=entrada.nextInt();
        int[] vec1=new int[n];
        int[] vec2=new int[n];
        int i;
        for(i=0;i<n;i++){
            vec1[i]=(int)(Math.random()*101);
           // vec2[i]=(int)(Math.random()*101);
           vec2[i]=vec1[i];
        }
        for(i=0;i<n;i++){
            if(vec1[i]!=vec2[i]){
                break;
            }
        }
        if(i==n){
            System.out.println("Los vectores son iguales");
        }
        else{
            System.out.println("Los vectores NO son iguales");
        }
    }

}
