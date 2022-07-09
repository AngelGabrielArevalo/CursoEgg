 /*@author Angel Gabriel Arévalo*/ 

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionNumero {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      String sn1;
      String sn2;
      int n1;
      int n2;
      double div;
      
      try{
          System.out.println("Ingrese cadena 1:");
          sn1=entrada.nextLine();
          System.err.println("Ingrese cadena 2:");
          sn2=entrada.nextLine();
          
          n1=Integer.parseInt(sn1);
          n2=Integer.parseInt(sn2);
          
          div=n1/n2;
          
          System.out.println("Número 1: "+n1+" Número 2: "+n2+" División: "+div);
      }catch(InputMismatchException e){
          System.out.println("Dato ingresado por teclado invalido!");
      }catch(NumberFormatException e){
          System.out.println("La cadena ingresada no puede convertirse a entero!!");
      }catch(ArithmeticException e){
          System.out.println("No se puede divir por 0!!!");
      }
      
    }

}
