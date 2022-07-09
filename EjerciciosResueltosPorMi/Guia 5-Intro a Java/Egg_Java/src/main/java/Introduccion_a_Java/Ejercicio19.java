package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      int nota;
      do{
          System.out.println("Ingrese una nota entre 0 y 10:");
          nota=entrada.nextInt();
          if(nota<0 || nota>10){
              System.out.println("Error");
                  
          }
      }while(nota<0 || nota>10);
    }

}
