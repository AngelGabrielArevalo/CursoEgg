
package ejercicio09;

// @author Angel Arévalo

import ejercicio09.entidades.Raices;
import ejercicio09.servicios.ServicioRaices;
import java.util.Scanner;



public class CalculoRaices {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ServicioRaices sr=new ServicioRaices();
        Raices r1=sr.crearRaices();
        r1.toString();
        System.out.println("Discriminante: "+r1.getDiscriminate());
        System.out.println("Tiene raicez: "+ r1.tieneRaices(r1));
        System.out.println("Tiene raiz: "+r1.tieneRaiz(r1));
        r1.calcular(r1);
    }

}
