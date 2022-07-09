
package ejercicio1;

// @author Angel Arévalo

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class numeros {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ArrayList<Integer> numeros=new ArrayList<Integer>();
        numeros=leerValores();
        Integer sum=calcularSuma(numeros);
        double media=sum/numeros.size();
        mostrarResultados(numeros, sum, media);
    }
    
    public static ArrayList<Integer> leerValores(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese valores númericos enteros (-99 para finalizar):");
        Integer n=entrada.nextInt();
        ArrayList<Integer> numeros=new ArrayList<Integer>();
        while(n!=-99){
            numeros.add(n);
            n=entrada.nextInt();
        }
        System.out.println("----------------Ha finalizado la carga de números-----------------------");
        return numeros;
    }
    
    public static Integer calcularSuma(ArrayList<Integer> num){
        Integer sum=0;
        Iterator<Integer> it=num.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            sum+=next;
        }
        return sum;
    }
    
    public static void mostrarResultados(ArrayList<Integer> num, Integer sum, double media){
        System.out.println("---------------Valores del ArrayList--------------------");
        num.forEach(x->System.out.println(x.toString()));
        System.out.println("------------------------------------------------");
        System.out.println("La suma de los valores del ArrayList es: "+sum+" -- La media es "+media);
        int sumval=0;
        System.out.println("-----------------------------------");
        System.out.println("Los valores por enciama de la media son:");
        for(Integer x: num){
            if(x>media){
                sumval++;
                System.out.println(x.toString());
            }
        }
        System.out.println("La cantidad de valores por encima de la media es: "+sumval);
    }
}
