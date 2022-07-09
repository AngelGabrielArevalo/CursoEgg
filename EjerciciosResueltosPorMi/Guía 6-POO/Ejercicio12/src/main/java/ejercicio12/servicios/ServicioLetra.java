package ejercicio12.servicios;

import ejercicio12.entidades.Letra;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioLetra {
    Scanner entrada=new Scanner(System.in);
    
    public Letra crearLetra(){
        System.out.println("Ingrese DNI:");
        long dni=entrada.nextLong();
        return new Letra(dni);
    }
}
