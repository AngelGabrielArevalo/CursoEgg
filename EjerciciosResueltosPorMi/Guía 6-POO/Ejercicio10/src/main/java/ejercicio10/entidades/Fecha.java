package ejercicio10.entidades;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Fecha {

    private int dia, mes, anio;
    private Date fecha;
    GregorianCalendar valor_fecha=new GregorianCalendar();
    Scanner entrada=new Scanner(System.in);

    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 1900;
        valor_fecha.set(dia, (mes-1), dia);
        fecha=valor_fecha.getTime();
    }

    public Fecha(int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
        valor_fecha.set(getAnio(), (getMes()-1), getDia());
        setFecha(valor_fecha.getTime());
    }
    
    public void leer(){
        do{
            System.out.println("Ingrese año: (1990-2050)");
            anio=entrada.nextInt();
            if(anio<1900 || anio>2050){
                System.out.println("Año invalido");
            }
        }while(anio<1900 || anio>2050);
        setAnio(anio);
        do{
            System.out.println("Ingrese mes: (1-12)");
            mes=entrada.nextInt();
            if(mes<1 || mes>12){
                System.out.println("Mes invalido");
            }
        }while(mes<0 || mes>31);
        setMes(mes);
        do{
            System.out.println("Ingrese día: (1-31)");
            dia=entrada.nextInt();
            if(dia<1 || dia>31){
                System.out.println("Dia invalido");
            }
        }while(dia<1 || dia>diasMes(mes));
        setDia(dia);
        
        valor_fecha.set(getAnio(), (getMes()-1), getDia());
        setFecha(valor_fecha.getTime());
    }
    
    public boolean bisiesto(){
        if((getAnio()%4==0 && getAnio()%100!=0) || (getAnio()%100==0 && getAnio()%400==0)){
            return true;
        }
        else{
            return false;
        }
    }

    public int diasMes(int mess){
        if(bisiesto()){
            switch(mess){
                case 1:
                    return 31;
                case 2:
                    return 29;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;    
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;    
                case 11:
                    return 30;
                case 12:
                    return 31;  
                default:
                    return 0;
            }
        }
        else{
            switch(mess){
                case 1:
                    return 31;
                case 2:
                    return 28;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;    
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;    
                case 11:
                    return 30;
                case 12:
                    return 31;  
                default:
                    return 0;
            }
        }
    }
    
    public void validar(){
        if(getDia()<1 || getDia()>31){
            setDia(1);
        }
        if(getMes()<1 || getMes()>12){
            setMes(1);
        }
        if(getAnio()<1900 || getAnio()>2050){
            setAnio(1900);
        }
        valor_fecha.set(getAnio(), (getMes()-1), getDia());
        setFecha(valor_fecha.getTime());
    }

    public int diasTranscurridos(){
        valor_fecha.set(1900, 0, 1);
        Date fecha2=valor_fecha.getTime();
        long mseg=Math.abs(fecha.getTime()-fecha2.getTime());
        return Math.round(mseg/86400000);
    }
    
    public int diasEntre(Fecha fecha){
        long mseg=Math.abs(this.fecha.getTime()-fecha.getFecha().getTime());
        return Math.round(mseg/86400000);
    }
    
    public int diaSiguiente(){
        valor_fecha.setTime(fecha);
        return valor_fecha.get(Calendar.DATE)+1;
    }
    
    public int diaAnterior(){
        valor_fecha.setTime(fecha);
        return valor_fecha.get(Calendar.DATE)-1;
    }
    
    //GETTERS Y SETTERS
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public Date getFecha() {
        return fecha;
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

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
    
    

}
