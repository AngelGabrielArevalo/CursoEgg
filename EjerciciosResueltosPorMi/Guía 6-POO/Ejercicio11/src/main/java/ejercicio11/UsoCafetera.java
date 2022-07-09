package ejercicio11;

/*@author Angel Gabriel Arévalo*/
import ejercicio11.entidades.Cafetera;
import ejercicio11.servicios.ServicioCafetera;
import java.util.Scanner;

public class UsoCafetera {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioCafetera sc = new ServicioCafetera();
        Cafetera c1 = sc.crearCafetera();
        System.out.println(c1.toString());
        c1.vaciarCafetera();
        System.out.println(c1.toString());

    }

}
