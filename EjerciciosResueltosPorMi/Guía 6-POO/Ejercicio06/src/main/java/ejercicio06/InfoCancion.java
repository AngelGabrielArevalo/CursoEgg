package ejercicio06;

/*@author Angel Gabriel Arévalo*/
import ejercicio06.entidades.Cancion;
import ejercicio06.servicios.ServicioCancion;
import java.util.Scanner;

public class InfoCancion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioCancion sc = new ServicioCancion();
        Cancion c1 = sc.crearCancion();
        System.out.println(c1.toString());
        c1.setTitulo("Wake me Up");
        c1.setAutor("Avici");
        System.out.println(c1.toString());
    }

}
