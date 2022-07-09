package extraB.entidades;

import extraB.enumeraciones.PaloBarEspaniola;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public abstract class Baraja {
    protected int numCartasTotal;
    protected int numCartasPorPalo;
    protected ArrayList<Carta> baraja = new ArrayList();
    protected ArrayList<Carta> cartasBarajadas=new ArrayList();

    public Baraja(int numCartasTotal, int numCartasPorPalo) {
        this.numCartasTotal = numCartasTotal;
        this.numCartasPorPalo = numCartasPorPalo;
    }

   

    public abstract void crearBaraja();
    
    public void mostrarBaraja() {
        System.out.println("-------------------BARAJA-----------------------------");
        for (int i = 0; i < baraja.size(); i++) {
            System.out.println(baraja.get(i).toString());
        }
        System.out.println("CANTIDAD DE CARTAS: " + baraja.size());
        System.out.println("------------------------------------------------------");
    }

    public static void barajar(ArrayList<Carta> baraja) {
        Collections.shuffle(baraja);
    }

    public Carta siguienteCarta() {
        if (baraja.size() == 0) {
            System.out.println("No quedan más cartas en la baraja!!!!!!!!!!!");
        } else {
            return baraja.get(0);
        }
        return null;
    }

    public  void cartasDisponibles() {
        System.out.println("Quedan disponibles en la baraja " + baraja.size() + " cartas.");
    }

    public void darCartas() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cartas que desea recibir:");
        int cant = entrada.nextInt();
        if (cant <= baraja.size()) {
            for (int i = 0; i < cant; i++) {
                cartasBarajadas.add(siguienteCarta());
                baraja.remove(0);
            }
        } else {
            System.out.println("No hay suficientes cartas en la baraja!!!!!!!!!!!!");
        }
    }

    public void cartasMonton() {
        System.out.println("---------------CARTAS BARAJADAS--------------------");
        for (int i = 0; i < cartasBarajadas.size(); i++) {
            System.out.println(cartasBarajadas.get(i).getValor() + " de " + cartasBarajadas.get(i).getPalo());
        }
        System.out.println("CANTIDAD DE CARTAS: " + cartasBarajadas.size());
        System.out.println("------------------------------------------------------");
    }
}
