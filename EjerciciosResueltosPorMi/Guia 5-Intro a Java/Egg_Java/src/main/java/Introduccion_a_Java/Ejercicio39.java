
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio39 {

    public static void main(String[] args) {
       // Scanner entrada=new Scanner(System.in);
       int i;
       int[] vec=new int[100];
       for(i=99;i>=0;i--){
           vec[99-i]=i;
           System.out.println(vec[99-i]);
       }
    }

}
