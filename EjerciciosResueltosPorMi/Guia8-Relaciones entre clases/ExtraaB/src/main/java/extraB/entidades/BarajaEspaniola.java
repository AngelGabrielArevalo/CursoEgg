package extraB.entidades;

import extraB.enumeraciones.PaloBarEspaniola;

/*@author Angel Gabriel Arévalo*/
public class BarajaEspaniola extends Baraja {

    boolean ochoynueve;

    public BarajaEspaniola(boolean ochoynueve) {
        super(cantCartas(ochoynueve), cantCartas(ochoynueve)/4);
        this.ochoynueve = ochoynueve;
    }

    private static int cantCartas(boolean ochoynuve){
        if(ochoynuve){
            return 48;
        }else{
            return 40;
        }
    }
    
    @Override
    public void crearBaraja() {
        if (ochoynueve) { 
            for (int i = 1; i < 13; i++) {
                baraja.add(new Carta<PaloBarEspaniola>(i, PaloBarEspaniola.ESPADAS));
                baraja.add(new Carta<PaloBarEspaniola>(i, PaloBarEspaniola.BASTOS));
                baraja.add(new Carta<PaloBarEspaniola>(i, PaloBarEspaniola.OROS));
                baraja.add(new Carta<PaloBarEspaniola>(i, PaloBarEspaniola.COPAS));
            }
        }else{
            for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                baraja.add(new Carta<PaloBarEspaniola>(i, PaloBarEspaniola.ESPADAS));
                baraja.add(new Carta<PaloBarEspaniola>(i, PaloBarEspaniola.BASTOS));
                baraja.add(new Carta<PaloBarEspaniola>(i, PaloBarEspaniola.OROS));
                baraja.add(new Carta<PaloBarEspaniola>(i, PaloBarEspaniola.COPAS));
            }
        }
        }
    }

}
