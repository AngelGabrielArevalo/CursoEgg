package ejercicio16;

/*@author Angel Gabriel Arévalo*/
import ejercicio16.entidades.Matematica;
import java.util.Scanner;

public class OperacionesMatematicas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        double n1 = entrada.nextDouble();
        System.out.println("Ingrese otro número:");
        double n2 = entrada.nextDouble();
        System.out.println("Mayor: "+Matematica.devolverMayor(n1, n2));
        System.out.println("El mayor número elevado al menor es: "+Matematica.calcularPotencia(n1, n2));
        System.out.println("Raiz cuadrada del menor número: "+Matematica.calcularRaiz(n1, n2));
        System.out.println("La suma de los ángulos es: "+Matematica.sumaAngulos(n1, n2));
    }

}
