
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio42 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int n=entrada.nextInt();
        int[] vec=new int[n];
        int i;
        int cant1=0;
        int cant2=0;
        int cant3=0;
        int cant4=0;
        int cant5=0;
        for(i=0;i<n;i++){
            vec[i]=(int)(Math.random()*100000);
            if(vec[i]<10){
                cant1++;
            }
            else if(vec[i]<100){
                cant2++;
            }
            else if(vec[i]<1000){
                cant3++;
            }
            else if(vec[i]<10000){
                cant4++;
            }
            else{
                cant5++;
            }
        }
        System.out.println("1 dígito: "+cant1+"\n2 dígitos: "+cant2+"\n3 dígitos: "+cant3+"\n4 dígitos: "+cant4+"\n5 dígitos: "+cant5);
        
    }

}
