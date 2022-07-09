
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio45 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos:");
        int n=entrada.nextInt();
        int i;
        int cantaprob=0;
        int cantdesaprob=0;
        double[] notas=new double[n];
        cargarnotas(notas, n);
        for(i=0;i<n;i++){
            if(notas[i]>=7){
                cantaprob++;
            }
            else{
                cantdesaprob++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es "+cantaprob+"\nLa cantidad de alumnos desaprobados es "+cantdesaprob);
    }
    
    public static void cargarnotas(double[] notas, int n){
        int i;
        double notatp1, notatp2, notai1, notai2;
        Scanner entrada=new Scanner(System.in);
        for(i=0;i<n;i++){
            System.out.println("Ingrese las notas de  1TP, 2TP, 1I y 2I del alumno "+(i+1));
            notatp1=entrada.nextDouble();
            notatp2=entrada.nextDouble();
            notai1=entrada.nextDouble();
            notai2=entrada.nextDouble();
            notas[i]=notatp1*0.1+notatp2*0.15+notai1*0.25+notai2*0.5;
        }
    }
    
    
}
