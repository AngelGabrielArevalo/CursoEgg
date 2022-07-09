
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio46 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int i,j;
        int[][] mat=new int[4][4];
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                mat[i][j]=(int)(Math.random()*101);
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println("");
        }
    }

}
