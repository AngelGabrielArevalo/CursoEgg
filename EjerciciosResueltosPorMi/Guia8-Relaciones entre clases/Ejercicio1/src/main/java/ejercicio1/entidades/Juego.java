package ejercicio1.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class Juego {
    private ArrayList<Jugador> jugadores=new ArrayList();
    Revolver r;
    static int ronda_bala=0;
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        this.jugadores.addAll(jugadores);
        this.r=r;
    }
    
    public boolean ronda(){
        if(ronda_bala==jugadores.size()){
            ronda_bala=0;
        }
        if(jugadores.get(ronda_bala).disparo(r)){
            return true;
        }else{
            ronda_bala++;
            return false;
        } 
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public static int getRonda_bala() {
        return ronda_bala;
    }
    
    
}
