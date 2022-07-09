package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      int cant=0;
      int cantimpar=0;
      int cantpar=0;
      int num;
      do{
          System.out.println("Ingrese un número:");
          num=entrada.nextInt();
          if(num>0){
              cant++;
              if(num%2==0){
                  cantpar++;
              }
              else{
                  cantimpar++;
              }
          }
      }while(num%5!=0);
      System.out.println("La cantidad de números ingresado fue "+cant+"\nLa cantidad de números paraes ingresados fue "+cantpar+"\nLa cantidad de números impares ingresados fue "+cantimpar);
      
    }

}
