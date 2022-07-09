
package ejercicio6.entidades;

import java.util.Date;


public class EmbarcacionDeportivaaMotor extends Barco {
    private int potencia;

    public EmbarcacionDeportivaaMotor() {
    }

    public EmbarcacionDeportivaaMotor(int potencia, String matricula, int eslora, Date anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    @Override
    public int valorModulo() {
        return super.valorModulo()+potencia; 
    }

    
    
    
}
