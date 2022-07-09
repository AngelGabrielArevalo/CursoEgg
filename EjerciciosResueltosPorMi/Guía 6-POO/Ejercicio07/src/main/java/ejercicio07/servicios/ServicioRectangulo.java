package ejercicio07.servicios;

import ejercicio07.entidades.Rectangulo;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioRectangulo {
    Scanner entrada=new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese alto del rectángulo:");
        int alto=entrada.nextInt();
        System.out.println("Ingrese largo del rectángulo:");
        int largo=entrada.nextInt();
        return new Rectangulo(alto, largo);
    }
}
