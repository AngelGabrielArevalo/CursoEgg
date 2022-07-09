
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num=entrada.nextInt();
        int cant=1;
        while((num/10)>0){
            num=num/10;
            cant++;
        }
        System.out.println("La cantidad de digitos es "+cant);
    }

}
