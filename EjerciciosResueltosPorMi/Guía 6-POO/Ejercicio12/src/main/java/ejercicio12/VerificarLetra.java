package ejercicio12;

/*@author Angel Gabriel Arévalo*/
import ejercicio12.entidades.Letra;
import ejercicio12.servicios.ServicioLetra;
import java.util.Scanner;

public class VerificarLetra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioLetra sl = new ServicioLetra();
        Letra l1 = sl.crearLetra();
        System.out.println(l1.toString());
        System.out.println(l1.mostrarNIF());
        l1.setDni(40461304);
        System.out.println(l1.mostrarNIF());
    }

}
