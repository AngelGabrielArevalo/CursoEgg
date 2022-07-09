package ejercicio2;

/*@author Angel Gabriel Arévalo*/
import java.util.Scanner;

public class IndicedeVectorFueradeRango {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vec = new int[10];
        
        for (int i = 0; i <= vec.length; i++) {
            try{
                vec[i]=1;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Indice del vector fuera de rango");
            }
        }
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
    }
    
}
