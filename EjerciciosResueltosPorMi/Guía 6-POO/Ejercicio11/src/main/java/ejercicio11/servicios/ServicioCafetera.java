package ejercicio11.servicios;

import ejercicio11.entidades.Cafetera;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioCafetera {
    Scanner entrada=new Scanner(System.in);
    
    public Cafetera crearCafetera(){
        System.out.println("Ingrese la capacidad máxima de la cafetera:");
        int capacidadMaxima=entrada.nextInt();
        return new Cafetera(capacidadMaxima);
    }
}
