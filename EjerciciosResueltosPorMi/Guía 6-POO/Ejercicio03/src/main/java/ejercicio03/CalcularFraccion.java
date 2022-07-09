package ejercicio03;

/*@author Angel Gabriel Arévalo*/
import ejercicio03.entidades.Fraccion;
import ejercicio03.servicios.ServicioFraccion;
import java.util.Scanner;

public class CalcularFraccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioFraccion sf = new ServicioFraccion();
        Fraccion f1 = sf.crearFraccion();
        System.out.println(f1.sumarFraccion());
        System.out.println(f1.restarFraccion());
        System.out.println(f1.multiplicarFraccion());
        System.out.println(f1.dividirFraccion());
        System.out.println(f1.sumarFraccionString());
        System.out.println(f1.restarFraccionString());
        System.out.println(f1.multiplicarFraccionString());
        System.out.println(f1.dividirFraccionString());
    }

}
