package ejercicio15;

/*@author Angel Gabriel Arévalo*/
import ejercicio15.entidades.Cadena;
import ejercicio15.servicios.ServicioCadena;
import java.util.Scanner;

public class UsoCadena {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ServicioCadena sc = new ServicioCadena();
        Cadena c1 = sc.crearCadena();
        System.out.println(c1.toString()+"----------------");
        System.out.println("La cantidad de vocales es: "+c1.mostrarVocales());
        c1.invertirFrase();
        System.out.println("Ingrese un caracter:");
        String carac=entrada.next();
        System.out.println("El caracter se repite "+c1.vecesRepetido(carac)+" veces.");
        System.out.println("Ingrese otra frase: ");
        String frase2=entrada.next();
        c1.compararLongitud(frase2);
        c1.unirFrases(frase2);
        System.out.println(c1.toString());
        System.out.println("Ingrese caracter para reemplazar:");
        carac=entrada.next();
        c1.reemplazar(carac);
        System.out.println(c1.toString());
        
    }    
}        
        

