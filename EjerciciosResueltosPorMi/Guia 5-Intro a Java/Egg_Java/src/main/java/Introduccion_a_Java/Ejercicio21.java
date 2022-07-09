package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese la cantidad de personas que desea analizar:");
      int n=entrada.nextInt();
      int i;
      double sum=0;
      double ingreso;
      for(i=0;i<n;i++){
          System.out.println("Ingrese la altura de la persona "+(i+1));
          ingreso=entrada.nextDouble();
          sum=sum+ingreso;
      }
      System.out.println("El promedio de altura es "+(sum/(double)n));
    }

}
