package ejercicio1.entidades;

/*@author Angel Gabriel Arévalo*/
public class Revolver {
    private int posActual, posBala, capacidadRevolver;

    public Revolver() {
        capacidadRevolver=6;
    }

    public Revolver(int capacidadRevolver) {
        this.capacidadRevolver = capacidadRevolver;
    }

    public void llenarRevolver(){
        posActual=(int)(Math.random()*(capacidadRevolver+1));
        posBala=(int)(Math.random()*(capacidadRevolver+1));
    }
    
    public boolean disparar(){
        if(posActual==posBala){
            return true;
        }
        return false;
    }
    
    public void siguienteBala(){
        if(posActual==capacidadRevolver){
            posActual=1;
        }else{
            posActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posBala=" + posBala + '}';
    }

    public int getCapacidadRevolver() {
        return capacidadRevolver;
    }
    
    
    
}
