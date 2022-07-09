package ejercicio03.servicios;

import ejercicio03.entidades.Fraccion;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioFraccion {
    Scanner entrada=new Scanner(System.in);
    
    public Fraccion crearFraccion(){
        System.out.println("Ingrese numerador de la primera fracción:");
        int n1=entrada.nextInt();
        System.out.println("Ingrese denominador de la primera fracción:");
        int d1=entrada.nextInt();
        System.out.println("Ingrese numerador de la segunda fracción:");
        int n2=entrada.nextInt();
        System.out.println("Ingrese denominador de la segunda fracción:");
        int d2=entrada.nextInt();
        return new Fraccion(n1, d1, n2, d2);
    }
    
}
