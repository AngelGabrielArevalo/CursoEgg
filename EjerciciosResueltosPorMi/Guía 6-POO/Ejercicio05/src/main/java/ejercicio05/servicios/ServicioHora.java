package ejercicio05.servicios;

import ejercicio05.entidades.Hora;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioHora {
    Scanner entrada=new Scanner(System.in);
    
    public Hora crearHora(){
        System.out.println("Ingrese la hora:");
        int hora=entrada.nextInt();
        System.out.println("Ingrese los minutos:");
        int minutos=entrada.nextInt();
        System.out.println("Ingrese los segundos");
        int segundos=entrada.nextInt();
        return new Hora(hora, minutos, segundos);
    }
}
