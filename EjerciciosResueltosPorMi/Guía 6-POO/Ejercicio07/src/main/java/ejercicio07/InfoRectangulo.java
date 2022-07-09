package ejercicio07;

/*@author Angel Gabriel Arévalo*/
import ejercicio07.entidades.Rectangulo;
import ejercicio07.servicios.ServicioRectangulo;
import java.util.Scanner;

public class InfoRectangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioRectangulo sr=new ServicioRectangulo();
        Rectangulo r1=sr.crearRectangulo();
        System.out.println(r1.toString());
        r1.dibujarRectangulo();
        r1.desplazarRectangulo(2, 2);
        System.out.println(r1.toString());
        r1.dibujarRectangulo();
    }

}
