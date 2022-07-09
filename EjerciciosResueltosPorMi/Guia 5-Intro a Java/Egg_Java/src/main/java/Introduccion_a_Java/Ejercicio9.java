
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el número entero correspondiente a A:");
        int a=entrada.nextInt();
        System.out.println("Ingrese el número entero correspondiente a B:");
        int b=entrada.nextInt();
        System.out.println("Ingrese el número entero correspondiente a C:");
        int c=entrada.nextInt();
        System.out.println("Ingrese el número entero correspondiente a D:");
        int d=entrada.nextInt();
        System.out.println("A="+a+", B="+b+", C="+c+" y D="+d);
        int aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("A="+a+", B="+b+", C="+c+" y D="+d);
        
        
        
              
    }

}
