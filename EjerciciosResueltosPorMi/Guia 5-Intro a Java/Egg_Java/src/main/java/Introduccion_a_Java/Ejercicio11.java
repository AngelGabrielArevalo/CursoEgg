package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese un número");
      int num=entrada.nextInt();
      if (num%2==0){
          System.out.println("El número ingresado es par");
      }
      else{
          System.out.println("El número ingresado es impar");
      }
    }

}
