
package ejercicio6.entidades;

import java.util.Date;



public class YateDeLujo extends Barco{
    private int potencia;

    public YateDeLujo() {
    }

    public YateDeLujo(int potencia, String matricula, int eslora, Date anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    @Override
    public int valorModulo() {
        return super.valorModulo()+potencia; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
