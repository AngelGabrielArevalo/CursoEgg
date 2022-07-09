package ejercicio3;

/*@author Angel Gabriel Arévalo*/
import ejercicio3.entidades.Carta;
import ejercicio3.enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javafx.print.Collation;

public class BarajaCartas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Carta> baraja = new ArrayList();
        ArrayList<Carta> cartasBarajadas=new ArrayList();
        llenarBaraja(baraja);
        barajar(baraja);
        mostrarBaraja(baraja);
        darCartas(baraja, cartasBarajadas);
        mostrarBaraja(baraja);
        cartasMonton(cartasBarajadas);
    }
    
    public static void llenarBaraja(ArrayList<Carta> baraja) {
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                baraja.add(new Carta(i, Palo.Espada));
                baraja.add(new Carta(i, Palo.Basto));
                baraja.add(new Carta(i, Palo.Oro));
                baraja.add(new Carta(i, Palo.Copa));
            }
        }
    }
    
    public static void mostrarBaraja(ArrayList<Carta> baraja){
        System.out.println("-------------------BARAJA-----------------------------");
        for (int i = 0; i < baraja.size(); i++) {
            System.out.println(baraja.get(i).getValor()+" de "+baraja.get(i).getPalo());
        }
        System.out.println("CANTIDAD DE CARTAS: "+baraja.size());
        System.out.println("------------------------------------------------------");
    }
    
    public static void barajar(ArrayList<Carta> baraja){
        Collections.shuffle(baraja);
    }
    
    public static Carta siguienteCarta(ArrayList<Carta> baraja){
        if(baraja.size()==0){
            System.out.println("No quedan más cartas en la baraja!!!!!!!!!!!");
        }else{
          return baraja.get(0);  
        }
        return null;
    }
    
    public static void cartasDisponibles(ArrayList<Carta> baraja){
        System.out.println("Quedan disponibles en la baraja "+baraja.size()+" cartas.");
    }
    
    public static void darCartas(ArrayList<Carta> baraja, ArrayList<Carta> cartasBarajadas){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cartas que desea recibir:");
        int cant=entrada.nextInt();
        if(cant<=baraja.size()){
           for (int i = 0; i < cant; i++) {
            cartasBarajadas.add(siguienteCarta(baraja));
            baraja.remove(0);
            } 
        }else{
            System.out.println("No hay suficientes cartas en la baraja!!!!!!!!!!!!");
        } 
    }
    
    public static void cartasMonton(ArrayList<Carta> cartasBarajadas){
        System.out.println("---------------CARTAS BARAJADAS--------------------");
        for (int i = 0; i < cartasBarajadas.size(); i++) {
            System.out.println(cartasBarajadas.get(i).getValor()+" de "+cartasBarajadas.get(i).getPalo());
        }
        System.out.println("CANTIDAD DE CARTAS: "+cartasBarajadas.size());
        System.out.println("------------------------------------------------------");
    }
    
}
