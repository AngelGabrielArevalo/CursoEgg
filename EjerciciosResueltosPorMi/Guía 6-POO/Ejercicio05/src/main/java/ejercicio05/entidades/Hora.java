package ejercicio05.entidades;

import java.sql.Time;
import java.util.Date;
import java.util.GregorianCalendar;

/*@author Angel Gabriel Arévalo*/
public class Hora {
    private int hora, minutos, segundos;

    public Hora() {
    }

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Hora{" + "hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }
    
    public Time imprimirHoraCompleta(){
        return new Time(hora, minutos, segundos);
    }
}
