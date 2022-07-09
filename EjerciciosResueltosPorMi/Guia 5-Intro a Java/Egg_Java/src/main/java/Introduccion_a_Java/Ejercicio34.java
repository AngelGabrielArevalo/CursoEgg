
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio34 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese cuatro números:");
        int n1=entrada.nextInt();
        int n2=entrada.nextInt();
        int n3=entrada.nextInt();
        int n4=entrada.nextInt();
        int i,j;
        for(i=0;i<4;i++){
            switch(i){
                case 0:
                    System.out.print(n1);
                    for(j=0;j<n1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                case 1:
                    System.out.print(n2);
                    for(j=0;j<n2;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                    break;    
                case 2:
                    System.out.print(n3);
                    for(j=0;j<n3;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                    break;    
                case 3:
                    System.out.print(n4);
                    for(j=0;j<n4;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                    break;    
            }
        }
    }

}
