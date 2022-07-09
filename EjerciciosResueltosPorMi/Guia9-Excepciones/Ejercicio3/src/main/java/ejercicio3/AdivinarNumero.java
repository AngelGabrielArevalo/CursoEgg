package ejercicio3;

/*@author Angel Gabriel Arévalo*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numAleatorio = (int) ((Math.random() * 500) + 1);
        int numUsuario = 600;
        int cantIntentos = 0;
        System.out.println(numAleatorio);
        System.out.println("Ingrese un número:");
        do {
            try {
                numUsuario = entrada.nextInt();
                if (numUsuario < numAleatorio) {
                    System.out.println("El número ingresado es menor.");
                }
                if (numUsuario > numAleatorio) {
                    System.out.println("El número ingresado es mayor.");
                }
            } catch (Exception e) {
                System.out.println("Debe ingresar un número entero.");
                entrada.next();
            } finally {
                cantIntentos++;
                if (numUsuario != numAleatorio) {
                    System.out.println("Vuelva a ingresar un número:");
                }
            }

        } while (numUsuario != numAleatorio);
        System.out.println("Enhorabuena!!!!!!");
        System.out.println("Intentos: " + cantIntentos);
    }

}
