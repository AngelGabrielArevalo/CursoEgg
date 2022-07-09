package ejercicio02.servicios;

import ejercicio02.entidades.Circunferencia;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioCircunferencia {
    Scanner entrada=new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese radio de la circunferencia:");
        double radio=entrada.nextDouble();
        return new Circunferencia(radio);
    }
    
}
