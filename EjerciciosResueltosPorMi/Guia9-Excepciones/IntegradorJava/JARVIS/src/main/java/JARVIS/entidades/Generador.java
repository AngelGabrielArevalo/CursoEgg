package JARVIS.entidades;

/*@author Angel Gabriel Arévalo*/
public class Generador {
    private int nivelEnergiaGenerador; 

    
    //Metodos Getters y Setters
    public int getNivelEnergiaGenerador() {
        return nivelEnergiaGenerador;
    }

    public void setNivelEnergiaGenerador(int nivelEnergiaGenerador) {
        this.nivelEnergiaGenerador = nivelEnergiaGenerador;
    }
    
    /**
     * Este metodo recibe un nivel de energía consumida desde la 
     * armadura y se lo resta al nivel de energía del generador.
     * @param energiaConsumida energía consumida desde la armadura(al realizar una acción).
     */
    public void energiaConsumida(int energiaConsumida){
        nivelEnergiaGenerador-=energiaConsumida;
    }
}
