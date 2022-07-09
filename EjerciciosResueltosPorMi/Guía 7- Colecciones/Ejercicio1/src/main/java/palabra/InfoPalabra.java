
package palabra;

// @author Angel Arévalo

import java.util.*;
import palabra.entidades.Palabra;



public class InfoPalabra {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de palabras que desea agregar:");
        Palabra pal=new Palabra();
        int n=entrada.nextInt();
        for (int i = 0; i < n; i++) {
            pal.agregarPalabra(entrada.next());
        }
        System.out.println("---------------------SE HAN AGREAGADO LAS PALABRAS------------------");
        pal.getPalabras().forEach(x->System.out.println(x.toString()));
        System.out.println("---------------------------------------");
        System.out.println("Ingrese la longitud de las palabras que desea visualizar:");
        int longitud=entrada.nextInt();
        ArrayList<String> palfilt=new ArrayList<String>();
        for(String x: pal.getPalabras()){
            if(x.length()==longitud){
                palfilt.add(x);
            }
        }
        Collections.sort(palfilt);
        palfilt.forEach(x->System.out.println(x.toString()));
        Comparator<String> comparador=Collections.reverseOrder();
        Collections.sort(palfilt, comparador);
        palfilt.forEach(x->System.out.println(x.toString()));
        
    }

}
