package ejercicio15.servicios;

import ejercicio15.entidades.Cadena;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioCadena {
    Scanner entrada=new Scanner(System.in);
    
    public Cadena crearCadena(){
        System.out.println("Ingrese una frase:");
        String frase=entrada.next();
        return new Cadena(frase);
    }
}
