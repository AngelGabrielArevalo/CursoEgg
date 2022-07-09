
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros y la moneda a la que desea convertir:");
        double cant=entrada.nextDouble();
        String moneda=entrada.next();
        convertireuros(cant, moneda);
    }
    
    public static void convertireuros(double cant, String moneda){
            switch(moneda){
            case "libras":
                System.out.println(cant*0.86);
                break;
            case "$":
                System.out.println(cant*1.28611);
                break;    
            case "yenes":
                System.out.println(cant*129.852);
                break;     
            default:
                System.out.println("No ingresó una moneda valida");
            }          
    }
}
