package ejercici018;

/*@author Angel Gabriel Arévalo*/
import ejercicio18.entidades.Arreglos;
import java.util.Scanner;

public class UsoArreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Arreglos a1 = new Arreglos();
        a1.llenarArreglo();     
        a1.mostrarArreglo(a1.getArreglo1(), a1.getArreglo1().length );
        a1.ordenarArreglo();
        a1.mostrarArreglo(a1.getArreglo1(), a1.getArreglo1().length );
        a1.copiaryLlenarArreglo();
        a1.mostrarArreglo(a1.getArreglo1(), a1.getArreglo1().length );
        a1.mostrarArreglo(a1.getArreglo2(), a1.getArreglo2().length );
      
    }

}
