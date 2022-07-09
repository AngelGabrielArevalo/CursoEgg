package ejercico04.servicios;

import ejercicio04.entidades.Punto;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class ServicioPunto {
    Scanner entrada=new Scanner(System.in);
    
    public Punto crearPunto(){
        System.out.println("Ingrese coordenada X:");
        double x=entrada.nextDouble();
        System.out.println("Ingrese coordenada Y");
        double y=entrada.nextDouble();
        return new Punto(x, y);
    }
    
    public Punto distanciaentrePunto(Punto p1, Punto p2){
        return new Punto((p1.getX()-p2.getX()), (p1.getY()-p2.getY()));
    }
    
}
