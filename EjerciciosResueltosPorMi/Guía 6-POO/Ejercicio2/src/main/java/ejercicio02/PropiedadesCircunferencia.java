package ejercicio02;

/*@author Angel Gabriel Arévalo*/
import ejercicio02.entidades.Circunferencia;
import ejercicio02.servicios.ServicioCircunferencia;
import java.util.Scanner;

public class PropiedadesCircunferencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia c1 = sc.crearCircunferencia();
        System.out.println(c1.getRadio());
        System.out.println("Área: "+c1.areaCircunferencia());
        System.out.println("Perimetro: "+c1.perimetroCircunferencia());
        System.out.println("Ingrese el nuevo radio");
        double nuevo_radio=entrada.nextDouble();
        c1.setRadio(nuevo_radio);
        System.out.println(c1.getRadio());
        System.out.println("Área: "+c1.areaCircunferencia());
        System.out.println("Perimetro: "+c1.perimetroCircunferencia());
    }

}
