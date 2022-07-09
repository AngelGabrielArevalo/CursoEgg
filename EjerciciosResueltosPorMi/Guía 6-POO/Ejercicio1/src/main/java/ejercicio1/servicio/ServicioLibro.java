package ejercicio1.servicio;

import ejercicio1.entidades.Libro;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioLibro {
    Scanner entrada=new Scanner(System.in).useDelimiter("\n");
    public Libro crearLibro(){
        System.out.println("Ingrese ISBN del libro:");
        String isbn=entrada.next();
        System.out.println("Ingrese título del libro:");
        String titulo=entrada.next();
        System.out.println("Ingrese autor del libro:");
        String autor=entrada.next();
        System.out.println("Ingrese número de páginas del libro:");
        int num_pag=entrada.nextInt();
        return new Libro(isbn, titulo, autor, num_pag);
    }
    
}
