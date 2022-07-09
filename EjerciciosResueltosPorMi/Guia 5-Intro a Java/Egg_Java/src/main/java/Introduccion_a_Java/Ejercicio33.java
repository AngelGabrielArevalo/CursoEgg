
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias:");
        int fami=entrada.nextInt();
        int i,j;
        int canthijos=0;
        int sumedad=0;
        int hijos;
        for(i=0;i<fami;i++){
            System.out.println("Ingrese la cantidad de hijos de la familia "+(i+1));
            hijos=entrada.nextInt();
            canthijos+=hijos;
            for(j=0;j<hijos;j++){
                System.out.println("Ingrese la edad del hijo "+(j+1));
                sumedad=sumedad+entrada.nextInt();
            }
        }
        System.out.println("El promedio de edad de los hijos de todas las familias es "+(((double)sumedad)/((double)canthijos))+" años");
                
    }

}
