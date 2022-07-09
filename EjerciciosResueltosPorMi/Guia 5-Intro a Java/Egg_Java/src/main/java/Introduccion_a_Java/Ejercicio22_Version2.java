package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio22_Version2 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese la cantidad de números:");
      int n=entrada.nextInt();
      int sum=0;
      int min=0;
      int max=0;
      int i=0;
      int num;
      do{
          System.out.println("Ingrese el número "+(i+1));
          num=entrada.nextInt();
          sum=sum+num;
          if(i==0){
              min=num;
              max=num;
          }
          else{
              if(num<min){
                  min=num;
              }
              if(num>max){
                  max=num;
              }
          }
          i++;
      }while(i<n);
      System.out.println("El minimo número ingresado fue el "+min+"\nEl máximo número ingresado fue el "+max+"\nEl promedio de los números ingresados es "+((double)sum/n));
      
    }

}
