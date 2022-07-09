
package ejercicio10.servicios;

import ejercicio10.entidades.Fecha;
import java.util.Scanner;

public class ServicioFecha {
    Scanner entrada=new Scanner(System.in);
    
    public Fecha crearFecha(){
        System.out.println("Ingrese día:");
        int dia=entrada.nextInt();
        System.out.println("Ingrese mes:");
        int mes=entrada.nextInt();
        System.out.println("Ingrese año:");
        int anio=entrada.nextInt();
        return new Fecha(dia, mes, anio);
    }
}
