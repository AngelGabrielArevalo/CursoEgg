package ejercicio3.entidades;

import ejercicio3.enumeraciones.Palo;

/*@author Angel Gabriel Arévalo*/
public class Carta {
    Palo palo;
    int valor;

    public Carta(int valor, Palo palo) {
        this.palo = palo;
        this.valor = valor;
    }

    
    
    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" + "Valor=" + valor + ", Palo=" + palo + '}';
    }
    
    
}
