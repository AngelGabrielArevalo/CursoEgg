package Introduccion_a_Java;

 /*@author Angel Gabriel Arévalo*/ 

import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz contenedora:");
        int n1=entrada.nextInt();
        System.out.println("Ingrese la dimensión de la submatriz");
        int n2=entrada.nextInt();
        int[][] mat1=new int[n1][n1];
        int[][] mat2=new int [n2][n2];
        int[][] matvec=new int[n1-n2+1][n1-n2+1];//armo una matriz para ver las posiciones donde se encuentra la submatriz
        int i,j;
        for(i=0;i<n1-n2+1;i++){//cargo esta matriz con -1, si tiene una posicion valida valdra "1"
            for(j=0;j<n1-n2+1;j++){
                matvec[i][j]=-1;
            }
        }
        cargarmatrizporusuario(mat1, n1, n1);
        cargarmatrizporusuario(mat2, n2, n2);
        if(estacontenida(mat1, mat2, n1, n2, matvec)){//pregunto si esta contenida
            System.out.println("La submatriz se encuentra contenida en la matrix contenedora, en las posiciones:");
            for(i=0;i<n1-n2+1;i++){//si está contenida, busco las posiciones
                for(j=0;j<n1-n2+1;j++){
                    if(matvec[i][j]==1){
                        System.out.println(i+","+j);
                    }
                }
            }
        }
        else{
            System.out.println("No se encuentra contenida.");
        }
        
    }
    
    public static void cargarmatrizporusuario(int[][] mat, int n, int m){
        Scanner entrada=new Scanner(System.in);
        int i,j;
        for(i=0;i<n;i++){
            System.out.println("Ingrese los valores de la fila "+(i+1));
            for(j=0;j<m;j++){
                mat[i][j]=entrada.nextInt();
            }
        }
    }
    
    public static boolean estacontenida(int[][] mat1, int[][] mat2, int n1, int n2, int[][] matvec){
        int i,j,k,z;
        boolean salir=false;
        int cant=0;
        int cantconten=0;
        boolean contenida=false;
        for(i=0;i<=n1-n2;i++){
            for(j=0;j<=n1-n2;j++){//recorro la matriz contenedora hasta las posiciones donde sea posible contener a la submatriz
                for(k=0;k<n2;k++){
                    for(z=0;z<n2;z++){//recorro la submatriz
                        if(mat2[k][z]!=mat1[k+i][z+j]){
                            salir=true;
                            break;
                        }
                        else{
                           cant++; 
                        }
                    }
                    if(salir){
                        salir=false;
                        break;
                    }
                }
                if(cant==n2*n2){
                    cantconten++;
                    matvec[i][j]=1;    
                }
                cant=0;
            }
            
        }
        if(cantconten>0){
            contenida=true;
        }
        else{
            contenida=false;
        }
        return contenida;
    }
}
