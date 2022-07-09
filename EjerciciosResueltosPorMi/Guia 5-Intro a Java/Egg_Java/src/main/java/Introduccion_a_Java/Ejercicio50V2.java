package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio50V2 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      int[][] mat1={{1,2,1,2},{1,2,1,2},{1,2,1,2},{1,2,1,2}};
      int[][] mat2={{1,2},{1,2}};
        estaContenida(mat1, mat2, 4, 2);
    }
    
    
    
    
    public static void estaContenida(int[][] mat1, int[][]mat2, int n1, int n2){
        int[] vec1=new int[n1*n1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                vec1[(i*n1)+j]=mat1[i][j];
            }
        }
        for (int i : vec1) {
            System.out.print(i+" ");
        }
        System.out.println("");
        
        int[] vec2=new int[n2*n2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                vec2[(i*n2)+j]=mat2[i][j];
            }
        }
        for (int i : vec2) {
            System.out.print(i+" ");
        }
        System.out.println("");
        
        int j;
        for (int i = 0; i <= (n1*n1)-(n2*n2); i++) {
            for (j = 0; j < n2*n2; j++) {
                if (vec2[j]!=vec1[i+j]) {
                    break;
                }
            }
            if(j==n2*n2){
                System.out.println("La submatriz está contenida en: ("+(i/n1)+","+(i%n1)+")");
            }      
        }
        
    }

}
