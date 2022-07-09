package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      int i;
      int suma=0;
      int num;
      for(i=0;i<20;i++){
          System.out.println("Ingrese un número");
          num=entrada.nextInt();
          if (num>0){
              suma=suma+num;
          }
          else if(num==0){
              System.out.println("Se capturó el número 0.");
              break;
          }
      }
      System.out.println("La suma de los números ingresados es "+suma);
    }

}
