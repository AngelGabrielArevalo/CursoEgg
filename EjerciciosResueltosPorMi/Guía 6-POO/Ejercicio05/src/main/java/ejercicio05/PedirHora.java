package ejercicio05;

/*@author Angel Gabriel Arévalo*/
import ejercicio05.entidades.Hora;
import ejercicio05.servicios.ServicioHora;
import java.util.Scanner;

public class PedirHora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioHora sh = new ServicioHora();
        Hora h1=sh.crearHora();
        System.out.println(h1.toString());
        System.out.println(h1.imprimirHoraCompleta());
    }

}
