package ejercicio19.servicios;

import ejercicio19.entidades.Persona;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioPersona {
    Scanner entrada=new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingrese nombre:");
        String nombre=entrada.next();
        System.out.println("A continuación se ingresa la fecha de nacimiento:");
        System.out.println("Ingrese año de nacimiento:");
        int anio=entrada.nextInt();
        System.out.println("Ingrese mes de nacimiento:");
        int mes=entrada.nextInt();
        System.out.println("Ingrese día:");
        int dia=entrada.nextInt();
        return new Persona(nombre, dia, mes, anio);
    }
}
