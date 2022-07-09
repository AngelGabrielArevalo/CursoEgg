
package ejercicio6.entidades;

import java.util.Date;

public class Barco {
    protected String matricula;
    protected int eslora;
    protected Date anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, Date anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    
    public int valorModulo(){
        return 10*eslora;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion.toString() + '}';
    }
    
    
    
    
    
}
