package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese una frase de 8 caracteres: ");
      String frase=entrada.nextLine();
      if(frase.length()==8){
          System.out.println("CORRECTO");
      }
      else{
          System.out.println("INCORRECTO");
      }
    }

}
