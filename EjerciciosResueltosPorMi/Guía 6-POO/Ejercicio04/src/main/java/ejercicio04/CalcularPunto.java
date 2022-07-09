package ejercicio04;

/*@author Angel Gabriel Arévalo*/
import ejercicio04.entidades.Punto;
import ejercico04.servicios.ServicioPunto;
import java.util.Scanner;

public class CalcularPunto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioPunto sp = new ServicioPunto();
        Punto p1 = sp.crearPunto();
        Punto p2 = sp.crearPunto();
        Punto p3 = sp.distanciaentrePunto(p1, p2);
        System.out.println("Punto 1: (" + p1.getX() + "," + p1.getY() + "). Punto2: (" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("Distancia: ("+p3.getX()+","+p3.getY()+")");
    }

}
