package extraB.entidades;

import extraB.enumeraciones.PaloBarFrancesa;

/*@author Angel Gabriel Arévalo*/
public class BarajaFrancesa extends Baraja{

    public BarajaFrancesa() {
        super(52, 13);
    }

    @Override
    public void crearBaraja() {
        for (int i = 1; i < 14; i++) {
                baraja.add(new Carta<PaloBarFrancesa>(i, PaloBarFrancesa.CORAZONES));
                baraja.add(new Carta<PaloBarFrancesa>(i, PaloBarFrancesa.DIAMANTES));
                baraja.add(new Carta<PaloBarFrancesa>(i, PaloBarFrancesa.PICAS));
                baraja.add(new Carta<PaloBarFrancesa>(i, PaloBarFrancesa.TREBOLES));
            }
    }
    
    public void cartaRoja(Carta<PaloBarFrancesa> c){
        if(c.getPalo().toString().equals("DIAMANTES")){
            System.out.println("La carta es de DIAMANTES!");
        }else if(c.getPalo().toString().equals("CORAZONES")){
            System.out.println("La carta es de CORAZONES!");
        }else{
            System.out.println("La carta no es ni de DIAMANTES ni de CORAZONES!");
        }
    }
    
    public void cartaNegra(Carta<PaloBarFrancesa> c){
        if(c.getPalo().toString().equals("TREBOL")){
            System.out.println("La carta es de TREBOL!");
        }else if(c.getPalo().toString().equals("PICAS")){
            System.out.println("La carta es de PICAS!");
        }else{
            System.out.println("La carta no es ni de TREBOL ni de PICAS!");
        }
    }
    
}
