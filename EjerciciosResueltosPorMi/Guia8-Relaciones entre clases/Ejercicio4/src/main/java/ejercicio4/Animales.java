package ejercicio4;

 /*@author Angel Gabriel Arévalo*/ 

import ejercicio4.entidades.Animal;
import ejercicio4.entidades.Caballo;
import ejercicio4.entidades.Gato;
import ejercicio4.entidades.Perro;
import java.util.Scanner;

public class Animales {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      Animal perro=new Perro("Stich", "Carnivoro", 15, "Doberman");
      perro.alimentarse();
      Perro perro1=new Perro("Toddy", "Croquetas", 10, "Chihuahua");
      perro1.alimentarse();
      perro1.ladrar();
      
      
      Animal gato=new Gato("Pelusa", "Galletas", 15, "Siames");
      gato.alimentarse();
      
      Animal caballo=new Caballo("Spark", "Pasto", 25, "Fino");
      caballo.alimentarse();
      
      
    }

}
