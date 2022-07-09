
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
       // Scanner entrada=new Scanner(System.in);
        int i,j,z;
        String contador;
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                for(z=0;z<10;z++){
                    contador=i+"-"+j+"-"+z;
                    if(contador.contains("3")){
                        contador=contador.replace("3", "E");
                    }
                    System.out.println(contador);
                }
            }
        }
    }

}
