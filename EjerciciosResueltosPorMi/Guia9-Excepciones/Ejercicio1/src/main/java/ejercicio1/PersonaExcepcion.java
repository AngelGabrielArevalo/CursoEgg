package ejercicio1;

 /*@author Angel Gabriel Arévalo*/ 

import ejercicio14.entidades.Persona;
import java.util.Scanner;


public class PersonaExcepcion {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      Persona p1=null;
      try{
        p1.esMayorDeEdad();
      }catch(NullPointerException e){
          System.out.println(e.getClass());
          System.out.println(e.getClass().getName());
          System.out.println(e.getMessage());
          e.printStackTrace();
      }
    }

}
