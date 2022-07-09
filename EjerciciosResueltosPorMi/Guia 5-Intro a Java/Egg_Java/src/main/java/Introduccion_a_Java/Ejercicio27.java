package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese el dividendo:");
      int dividendo=entrada.nextInt();
      System.out.println("Ingrese el divisor:");
      int divisor=entrada.nextInt();
      int cant=0;
      while(dividendo>=divisor){
          dividendo=dividendo-divisor;
          cant++;            
      }
      System.out.println("El residuo es "+dividendo+" y el cociente es "+cant);
    }

}
