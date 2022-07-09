package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese una frase: ");
      String frase=entrada.nextLine();
      if(frase.equals("eureka")){
          System.out.println("CORRECTO");
      }
      else{
          System.out.println("INCORRECTO");
      }
              
    }

}
