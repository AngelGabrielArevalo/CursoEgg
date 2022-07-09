package ejercicio13.servicios;

import ejercicio13.entidades.Ahorcado;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioAhorcado {
    Scanner entrada=new Scanner(System.in);
    
    public Ahorcado crearAhorcado(){
        System.out.println("Ingrese palabra del ahorcado (sin espacios)");
        String palabraaBuscar=entrada.next();
        System.out.println("Ingrese cantidad de intentos:");
        int cantidadIntentos=entrada.nextInt();
        return new Ahorcado(palabraaBuscar, cantidadIntentos);
        }
}

