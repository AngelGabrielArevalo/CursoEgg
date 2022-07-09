package ejercicio19.entidades;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*@author Angel Gabriel Arévalo*/
public class Persona {
    private String nombre;
    private Date fechaNac;
    GregorianCalendar calendario=new GregorianCalendar();
    private int dia, mes, anio;

    public Persona(String nombre, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        calendario.set(anio, (mes-1), dia);
        fechaNac=calendario.getTime();       
    }

    public int calcularEdad(){
        calendario=new GregorianCalendar();
        Date fechaActual=calendario.getTime();
        long mseg=Math.abs(fechaActual.getTime()-fechaNac.getTime());
        mseg=mseg/100000;
        long msanio=315576;
        return Math.round(mseg/msanio);
    }
    
    public boolean menorQue(Persona p){
        if(calcularEdad()<p.calcularEdad()){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    //GET Y SET
    public String getNombre() {
        return nombre;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + ", calendario=" + calendario + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
    
    
   
}
