package ejercicio06.servicios;

import ejercicio06.entidades.Cancion;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioCancion {
    Scanner entrada=new Scanner(System.in);
    
    public Cancion crearCancion(){
        System.out.println("Ingrese título de la canción:");
        String titulo=entrada.next();
        System.out.println("Ingrese el autor de la canción:");
        String autor=entrada.next();
        return new Cancion(titulo, autor);
    }
}
