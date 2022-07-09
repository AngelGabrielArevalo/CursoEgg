package ejercicio1.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class Jugador {
    private static int  id=0;
    private String nombre;
    private boolean vivo;   
    private ArrayList<Jugador> jugadores=jugadores=new ArrayList<Jugador>();

    public Jugador() {
        
    }

    public Jugador(String nombre, boolean vivo) {
        this.nombre = nombre;
        this.vivo = vivo;
    }
    
    
    public void llenarJugador(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores: (MAX 6)");
        int cantJugadores=entrada.nextInt();
        if(cantJugadores>6){
            cantJugadores=6;
        }
        for (int i = 0; i < cantJugadores; i++) {
            id++;
            jugadores.add(new Jugador(("Jugador "+id), true));
        }
    }
    
    public boolean disparo(Revolver r){
        if(r.disparar()){
            vivo=false;
            r.siguienteBala();
            return true;
        }else{
            r.siguienteBala();
            return false;
        }
    }
    
    

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", vivo=" + vivo + '}';
    }
    
    
    
    
    
}
