package ejercicio7;

/*@author Angel Gabriel Arévalo*/
import ejercicio7.entidades.EdificioDeOficinas;
import ejercicio7.entidades.Polideportivo;
import ejercicio7.enumeraciones.TipoDeInstalacion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArrayList<Polideportivo> polideportivos = new ArrayList<Polideportivo>();
        ArrayList<EdificioDeOficinas> edificios = new ArrayList();
        
        polideportivos.add(new Polideportivo(10, 5, "Cruz Azul", TipoDeInstalacion.TECLADO));
        polideportivos.add(new Polideportivo(20, 15, "Boca Juniors", TipoDeInstalacion.ABIERTO));
        polideportivos.add(new Polideportivo(30, 15, "Racinclub", TipoDeInstalacion.TECLADO));
        edificios.add(new EdificioDeOficinas(5, 7, 7, 10));
        edificios.add(new EdificioDeOficinas(15, 5, 7, 20));
        int cantA=0;
        int sup=0;
        System.out.println("-----------POLIDEPORTIVOS-----------------------");
        Iterator<Polideportivo> it=polideportivos.iterator();
        while (it.hasNext()) {
            Polideportivo next = it.next();
            System.out.println(next.toString());
            System.out.println("El polideportivo "+next.getNombre()+" tiene una superficie de "+next.calcularSuperficie()+"m2");
            sup+=next.calcularSuperficie();
            if(next.getTipoInstalacion().getCodigo().intValue()==2){
                cantA++;
            }
        }
        System.out.println("Cantidad de polideportivos: "+polideportivos.size());
        System.out.println("Cantidad de polideportivos con un tipo de intalacion abierta: "+cantA);
        System.out.println("Cantidad de polideportivos con un tipo de intalacion teclada: "+(polideportivos.size()-cantA));
        System.out.println("Superficie total de todos los polideportivos: "+sup+"m2");
        System.out.println("-----------------------EDIFICIOS-------------------------");
        Iterator<EdificioDeOficinas> it2=edificios.iterator();
        sup=0;
        while (it2.hasNext()) {
            EdificioDeOficinas next = it2.next();
            System.out.println(next.toString());
            System.out.println("Superficie: "+next.calcularSuperficie());
            sup+=next.calcularSuperficie();
        }
        System.out.println("Superficie total de todos los edificio: "+sup);
        
        
        }
    }
    
