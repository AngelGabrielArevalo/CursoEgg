package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese el valor del limite:");
      int limite=entrada.nextInt();
      int sum=0;
      do{
          System.out.println("Ingrese un número:");
          sum=sum+entrada.nextInt();
      }while(sum<=limite);
      System.out.println("Limite: "+limite+", Suma: "+sum);
    }

}
