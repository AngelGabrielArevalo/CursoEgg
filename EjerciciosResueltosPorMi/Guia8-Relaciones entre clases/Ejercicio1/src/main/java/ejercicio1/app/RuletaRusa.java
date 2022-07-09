package ejercicio1.app;

/*@author Angel Gabriel Arévalo*/
import ejercicio1.entidades.Juego;
import ejercicio1.entidades.Jugador;
import ejercicio1.entidades.Revolver;
import java.util.Scanner;

public class RuletaRusa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("------------------JUEGO RULETA RUSA---------------------------");
        Jugador jugador=new Jugador();
        jugador.llenarJugador();
        System.out.println("Ingrese la capacidad del revolver:");
        Revolver r=new Revolver(entrada.nextInt());
        r.llenarRevolver();
        System.out.println("DATOS: JUGADORES="+jugador.getJugadores().size()+", CAPACIDAD DEL REVOLVER="+r.getCapacidadRevolver());
        Juego juego=new Juego();
        juego.llenarJuego(jugador.getJugadores(), r);
        juego.getJugadores().forEach(x->System.out.println(x.toString()));
        System.out.println("---------------------EMPIEZA EL JUEGO--------------------------");
        int seguir;
        do{
            System.out.println(juego.getR().toString());
            if(juego.ronda()){
                System.out.println("El "+juego.getJugadores().get(juego.getRonda_bala()).getNombre()+" ha muerto.");
                System.out.println("-------------------------FIN DEL JUEGO--------------------------------");
                seguir=0;
            }else{
                System.out.println("El "+juego.getJugadores().get(juego.getRonda_bala()-1).getNombre()+" sigue vivo.");
                System.out.println("Para seguir el juego presione 1, para abortar presione 0");
                seguir=entrada.nextInt();
            }
        }while(seguir!=0);
    }
}
