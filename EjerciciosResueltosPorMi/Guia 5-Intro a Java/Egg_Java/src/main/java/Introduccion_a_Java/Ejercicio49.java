package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz cuadrada:");
        int n=entrada.nextInt();
        int[][] mat=new int[n][n];
        cargarmatrizporusuario(mat, n, n);
        mostrarmatriz(mat, n, n);
        System.out.println(esmagica(mat, n));
      
    }
    
    public static void cargarmatrizporusuario(int[][] mat, int n, int m){
        Scanner entrada=new Scanner(System.in);
        int i,j;
        for(i=0;i<n;i++){
            System.out.println("Ingrese los valores de la fila "+(i+1));
            for(j=0;j<m;j++){
                mat[i][j]=entrada.nextInt();
            }
        }
    }
    
    public static void mostrarmatriz(int[][] mat, int n, int m){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    
    public static boolean esmagica(int[][] mat, int n){
        int i,j;
        boolean magica=false;
        int cant=0;
        int auxf=0;
        int auxc=0;
        int auxdiag=0;
        int auxdiagtrans=0;
        for(i=0;i<n;i++){
           cant+=mat[0][i];
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                auxf+=mat[i][j];
                auxc+=mat[j][i];
                if(i==0){
                    auxdiag+=mat[j][j];
                    auxdiagtrans+=mat[j][n-1-j];
                }  
            }
            if(cant==auxf && cant==auxc && cant==auxdiag && cant==auxdiagtrans){
                magica=true;
                auxf=0;
                auxc=0;
            }
            else{
                magica=false;
                break;
            }
        }
       return magica;
    }
}
