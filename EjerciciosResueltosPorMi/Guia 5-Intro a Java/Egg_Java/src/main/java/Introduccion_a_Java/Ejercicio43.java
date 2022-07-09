
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio43 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int n=entrada.nextInt();
        int[] vec=new int[n];
        int i;
        int cant=0;
        for(i=0;i<n;i++){
            vec[i]=(int)(Math.random()*101);
        }
        System.out.println("Que número desea buscar:");
        int num=entrada.nextInt();
        for(i=0;i<n;i++){
            if(vec[i]==num){
                if(cant==0){
                    System.out.println("El número se encuentra en la posición "+i);
                }
                else{
                    System.out.print(","+i);
                }
                cant++;
            }
        }
        System.out.println("");
        if(cant>1){
            System.out.println("El número se encuentra repetido "+cant+" veces.");
        }
        else if(cant==0){
            System.out.println("El npumero no se encuentra en el vector");
        }
    }

}
