
package ejercicio6.entidades;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;





public class Alquiler {
    private String nombreCliente;
    private long dniCiente;
    private Calendar calendario=new GregorianCalendar();
    private Date fechaInicial;
    private Date fechaFinal;
    private String posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, long dniCiente, Date fechaInicial, Date fechaFinal, String posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCiente = dniCiente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    public int precioAlquiler(){
        int dias=difereciaDias();
        int valorFijo=2;
        return dias*barco.valorModulo()*valorFijo;
        
    }
    
    private int difereciaDias(){
       long aux1=fechaInicial.getTime();
       long aux2=fechaFinal.getTime();
       long aux3=86400000;
       return (int)((aux2-aux1)/aux3);
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", dniCiente=" + dniCiente + ", fechaInicial=" + fechaInicial.toString() + ", fechaFinal=" + fechaFinal.toString() + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    
    
}
