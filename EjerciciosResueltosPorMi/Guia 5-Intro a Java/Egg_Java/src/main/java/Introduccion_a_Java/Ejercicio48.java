package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas:");
        int n=entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnas:");
        int m=entrada.nextInt();
        int[][] mat=new int[n][m];
        int[][] matT=new int[m][n];
        cargarmatriz(mat, n, m);
        cargarmatriz(matT, m, n);
        //antisimetrica(mat, matT, n, m);
        mostrarmatriz(mat, n, m);
        System.out.println("");
        mostrarmatriz(matT, n, m);
        System.out.println("Es antisimetrica: "+esantisimetrica(mat, matT, n, m));
    }
    
    public static boolean esantisimetrica(int[][] mat, int[][] matT, int n, int m){
      boolean antisimetrica=false;
      int i,j;
      for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(mat[i][j]==-matT[j][i]){
                    antisimetrica=true;
                }
                else{
                    antisimetrica=false;
                    break;
                }
            }
            if(!antisimetrica){
                break;
            }
      }
      return antisimetrica;
    }
    
    public static void cargarmatriz(int[][] mat, int n, int m){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                mat[i][j]=(int)(Math.random()*11);
            }
        }
    }
    
    public static void antisimetrica(int[][] mat, int[][] matT, int n, int m){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                matT[j][i]=-mat[i][j];
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
  
    
    
    
}
