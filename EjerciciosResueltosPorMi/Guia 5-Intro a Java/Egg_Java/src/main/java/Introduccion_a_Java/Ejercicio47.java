package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas:");
        int n=entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnas:");
        int m=entrada.nextInt();
        int[][] mat=new int[n][m];
        int i,j;
        int suma=0;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                mat[i][j]=(int)(Math.random()*11);
                suma+=mat[i][j];
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los valores de la matriz es "+suma);
    }

}
