
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio38 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n=entrada.nextInt();
        System.out.println("El número ingresado es primo: "+ esprimo(n));
    }
    
    public static boolean esprimo(int n){
        boolean esprimo;
        int i;
        int cant=0;
        for(i=0;i<n;i++){
            if(n%(i+1)==0){
                cant++;
            }
        }
        if(cant==2){
            esprimo=true;
        }
        else{
            esprimo=false;
        }
        return esprimo;
    }
}
