
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio37 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que desea analizar:");
        int n=entrada.nextInt();
        nombreyedad(n);
    }
    
    public static void nombreyedad(int n){
        Scanner entrada=new Scanner(System.in);
        String seguir="";
        int cant=0;
        String nombre;
        int edad;
        do{
            System.out.println("Ingrese nombre y edad de la persona "+(cant+1));
            nombre=entrada.next();
            edad=entrada.nextInt();
            if(edad>=18){
                System.out.println(nombre+" es mayor de edad.");
            }
            else{
                System.out.println(nombre+" NO es mayor de edad.");
            }
            cant++;
            if(cant<n-1){
                System.out.println("Desea seguir mostrando personas (Si/No):");
                seguir=entrada.next();
            }
            
        }while(!seguir.equals("No") && cant<n);
    }
}
