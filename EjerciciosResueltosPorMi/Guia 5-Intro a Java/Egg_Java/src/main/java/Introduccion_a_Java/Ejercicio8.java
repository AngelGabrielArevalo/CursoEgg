
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;


public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos:");
        int minutos=entrada.nextInt();
        int dia=minutos/1440;
        int horas=(minutos%1440)/60;
        minutos=(minutos%1440)%60;
        System.out.println(dia+" día, "+horas+" horas y "+minutos+" minutos.");
        
    }

}
