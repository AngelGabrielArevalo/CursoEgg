package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo



*/ 

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese un número:");
      int num1=entrada.nextInt();
      System.out.println("Ingrese otro número:");
      int num2=entrada.nextInt();
      if(num1>num2){
          System.out.println("El mayor número ingresado fue "+num1);
      }
      else if(num2>num1){
          System.out.println("El mayor número ingresado fue "+num2);
      }
      else{
          System.out.println("Los números ingresados son iguales");
      }
    }
}
