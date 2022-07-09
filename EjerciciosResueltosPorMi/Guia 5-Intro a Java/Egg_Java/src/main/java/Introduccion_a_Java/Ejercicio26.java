package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      int cantvalid=0;
      int cantinvalid=0;
      String lectura_rs232;
      while(true){
          System.out.println("Ingrese los caracteres enviados por el sensor:");
          lectura_rs232=entrada.next();
          if(lectura_rs232.equals("&&&&&")){
              break;
          }
          if(lectura_rs232.length()==5 && lectura_rs232.substring(0, 1).equals("X") && lectura_rs232.substring(4, 5).equals("0")){
              cantvalid++;
          }
          else{
              cantinvalid++;
          }
      }
      System.out.println("La cantidad de lecturas correctas fue "+cantvalid+"\nLa cantidad de lecturas invalidas fue "+cantinvalid);
    }

}
