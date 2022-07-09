package ejercicio1;

/*@author Angel Gabriel Arévalo*/
import ejercicio1.entidades.Libro;
import ejercicio1.servicio.ServicioLibro;
import java.util.Scanner;

public class UsoLibro {

    public static void main(String[] args) {
        ServicioLibro sl = new ServicioLibro();
        Libro l1 = sl.crearLibro();
        System.out.println(l1.toString());
        System.out.println("");
        System.out.println(l1.mostrarInfo());

    }

}
