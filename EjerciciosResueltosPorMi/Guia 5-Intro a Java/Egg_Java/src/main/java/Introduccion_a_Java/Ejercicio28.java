
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int aleatorio1=(int)(Math.random()*11);
        int aleatorio2=(int)(Math.random()*11);
        int mul=aleatorio1*aleatorio2;
        int num;
        System.out.println(mul);
        do{
            System.out.println("Ingrese un número:");
            num=entrada.nextInt();
            if(num!=mul){
                System.out.println("Número incorrecto");
            }
            else{
                System.out.println("CORRECTOOO");
            }
        }while(num!=mul);
        
    }

}
