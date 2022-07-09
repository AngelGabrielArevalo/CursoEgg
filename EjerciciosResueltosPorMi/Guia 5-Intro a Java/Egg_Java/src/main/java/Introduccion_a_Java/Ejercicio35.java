
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio35 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese dos números:");
        int n1=entrada.nextInt();
        int n2=entrada.nextInt();
        System.out.println("Qué operación desea realizar:\n1:Suma\n2:Resta\n3:Multiplicación\n4:División");
        int opcion=entrada.nextInt();
        switch(opcion){
            case 1:
                System.out.println(sumar(n1,n2));
                break;
            case 2:
                System.out.println(restar(n1,n2));
                break;
            case 3:
                System.out.println(multiplicar(n1,n2));
                break;
            case 4:
                System.out.println(dividir(n1,n2));
                break;
        }
    }
    
    
    public static int sumar(int x, int y){
        int c=x+y;
        return c;
    }
    
    public static int restar(int x, int y){
        int c=x-y;
        return c;
    }
    
    public static int multiplicar(int x, int y){
        int c=x*y;
        return c;
    }
    
    public static double dividir(int x, int y){
        double c=(double)x/y;
        return c;
    }
}
