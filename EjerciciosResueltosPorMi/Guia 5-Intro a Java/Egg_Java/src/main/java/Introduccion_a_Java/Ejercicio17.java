package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese su tipo de obra social: ");
      String tipo=entrada.nextLine();
      System.out.println("Ingrese el valor del tratamiento: ");
      double valor=entrada.nextInt();
      switch(tipo){
          case "A":
          case "a":
              System.out.println("El valor que debe abonar para el tratamiento es: "+(valor*0.5));
              break;
          case "B":
          case "b":
              System.out.println("El valor que debe abonar para el tratamiento es: "+(valor*0.65));
              break;    
          case "C":
          case "c":
              System.out.println("El valor que debe abonar para el tratamiento es: "+(valor));
              break;    
      }
      
    }

}
