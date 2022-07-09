package ejercicio19;

/*@author Angel Gabriel Arévalo*/
import ejercicio19.entidades.Persona;
import ejercicio19.servicios.ServicioPersona;
import java.util.Scanner;

public class InfoPersona {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioPersona sp = new ServicioPersona();
        Persona p1 = sp.crearPersona();
        System.out.println(p1.calcularEdad());
        Persona p2=sp.crearPersona();
        System.out.println(p2.calcularEdad());
        System.out.println(p1.menorQue(p2));
    }

}
