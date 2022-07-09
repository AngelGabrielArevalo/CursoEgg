package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese un número:");
      int num1=entrada.nextInt();
      System.out.println("Ingrese otro número:");
      int num2=entrada.nextInt();
      int opcion;
      boolean salir=true;
      String seguir;
      do{
          System.out.println("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nElija opción:");
          opcion=entrada.nextInt();
          switch(opcion){
              case 1:
                     System.out.println(num1+"+"+num2+"="+(num1+num2));
                     break;
              case 2:
                     System.out.println(num1+"-"+num2+"="+(num1-num2));
                     break;       
             case 3:
                     System.out.println(num1+"*"+num2+"="+(num1*num2));
                     break;        
             case 4:
                     System.out.println(num1+"/"+num2+"="+((double)num1/num2));
                     break;        
            case 5:
                     System.out.println("Está seguro que desea salir (S/N):");
                     seguir=entrada.next();
                     if(seguir.equals("N")){
                      salir=true;
                     } 
                     else if(seguir.equals("S")){
                         salir=false;
                     }
                     else{
                         System.out.println("Debe ingresar S o N!!");
                     }
                   break;         
          }
      }while(salir);
    }

}
