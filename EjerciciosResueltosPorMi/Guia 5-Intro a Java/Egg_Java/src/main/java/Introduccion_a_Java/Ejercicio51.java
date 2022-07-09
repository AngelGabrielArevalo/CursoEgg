
package Introduccion_a_Java;

// @author Angel Arévalo

import java.util.Scanner;



public class Ejercicio51 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la dimensiones de la sopa de letras:");
        int n=entrada.nextInt();
        int m=entrada.nextInt();
        String[][] mat=new String[n][m];
        cargarsopa(mat, n, m);
        System.out.println("");
        System.out.println("SOPA DE LETRAS");
        mostrarmatriz(mat, n, m);
    }
    
    public static void cargarsopa(String[][] mat, int n, int m){
        int i,j;
        String palabra;
        int pos, aleatorio;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                mat[i][j]="-1";
            }
        }
        Scanner entrada=new Scanner(System.in);
        for(i=0;i<n;i++){
            do{
               System.out.println("Ingrese una palabra de 3 a 5 caracteres para la fila "+(i+1));
               palabra=entrada.next(); 
               if(!(palabra.length()<6 && palabra.length()>2)){
                    System.out.println("Error");
               }
            }while(!(palabra.length()<6 && palabra.length()>2));
            pos=(int)(Math.random()*(m-palabra.length()+1));
            for(j=pos;j<(palabra.length()+pos);j++){
                mat[i][j]=palabra.substring(j-pos, j-pos+1);
            }    
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(mat[i][j].equals("-1")){
                    aleatorio=(int)(Math.random()*10);
                    mat[i][j]=Integer.toString(aleatorio);
                }
            }
        }
    }
    public static void mostrarmatriz(String[][] mat, int n, int m){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
