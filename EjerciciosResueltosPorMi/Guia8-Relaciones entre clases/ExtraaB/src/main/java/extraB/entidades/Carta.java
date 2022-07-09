package extraB.entidades;

import extraB.enumeraciones.PaloBarEspaniola;
import extraB.enumeraciones.PaloBarFrancesa;

/*@author Angel Gabriel Arévalo*/
public class Carta<T> {
    private T palo;
    private int valor;

    public Carta(int valor, T palo) {
        this.palo = palo;
        this.valor = valor;
    }

    public T getPalo() {
        return palo;
    }

    public void setPalo(T palo) {
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
        if(palo instanceof PaloBarEspaniola){
            if(valor==1){
                return "Valor=" + "As" + ", Palo=" + palo.toString();
            }
            if(valor==10){
                return "Valor=" + "Sota" + ", Palo=" + palo.toString();
            }
            if(valor==11){
                return "Valor=" + "Caballo" + ", Palo=" + palo.toString();
            }
            if(valor==12){
                return "Valor=" + "Rey" + ", Palo=" + palo.toString();
            }else{
                return "Valor=" + valor + ", Palo=" + palo.toString();
            }
        }else{
            if(valor==1){
                return "Valor=" + "As" + ", Palo=" + palo.toString();
            }
            if(valor==11){
                return "Valor=" + "Jota" + ", Palo=" + palo.toString();
            }
            if(valor==12){
                return "Valor=" + "Reina" + ", Palo=" + palo.toString();
            }
            if(valor==13){
                return "Valor=" + "Rey" + ", Palo=" + palo.toString();
            }else{
                return "Valor=" + valor + ", Palo=" + palo.toString();
            }
        }
    }

    

   
}
