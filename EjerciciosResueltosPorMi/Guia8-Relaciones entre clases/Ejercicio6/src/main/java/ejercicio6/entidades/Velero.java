
package ejercicio6.entidades;

import java.util.Date;


public class Velero extends Barco{
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(int numeroMastiles, String matricula, int eslora, Date anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public int valorModulo() {
        return super.valorModulo()+numeroMastiles;
    }  

    @Override
    public String toString() {
        return super.toString()+" Tipo de Barco: Velero{" + "numeroMastiles=" + numeroMastiles + '}';
    }
    
    
}
