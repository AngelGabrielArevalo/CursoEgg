package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese un número:");
      int num=entrada.nextInt();
      String romano="";
      switch(num){
          case 1:
              romano="I";
              break;
          case 2:
              romano="II";
              break;
          case 3:
              romano="III";
              break;
          case 4:
              romano="IV";
              break;
          case 5:
              romano="V";
              break; 
          case 6:
              romano="VI";
              break;    
          case 7:
              romano="VII";
              break;  
          case 8:
              romano="VIII";
              break;  
          case 9:
              romano="IX";
              break;  
          case 10:
              romano="X";
              break;    
      }
      System.out.println("El equivalente en romano del número ingresado es: "+romano);
    }

}
