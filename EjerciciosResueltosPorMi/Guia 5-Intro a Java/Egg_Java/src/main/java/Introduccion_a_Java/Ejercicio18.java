package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese el tipo de motor:");
      int tipoMotor=entrada.nextInt();
      switch(tipoMotor){
          case 1:
              System.out.println("“La bomba es una bomba de agua");
              break;
          case 2:
              System.out.println("La bomba es una bomba de gasolina");
              break; 
          case 3:
              System.out.println("La bomba es una bomba de hormigón");
              break;
          case 4:
              System.out.println("La bomba es una bomba de pasata alimenticia");
              break;    
          default:
              System.out.println("No existe un valor válido para tipo de bomba");
      }
    }

}
