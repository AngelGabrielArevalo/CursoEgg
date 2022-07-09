package ejercicio11.entidades;

/*@author Angel Gabriel Arévalo*/
public class Cafetera {
    private int capacidadMaxima, cantidadActual;
    
    public Cafetera(){
        capacidadMaxima=1000;
        cantidadActual=0;
    }
    
    public Cafetera(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
        cantidadActual=capacidadMaxima;
    }

    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
    }
    
    public void servirTaza(int cantidadTaza){
        if(cantidadActual>=cantidadTaza){
            cantidadActual-=cantidadTaza;
        }else{
            cantidadActual=0;
        }
    }
    
    public void vaciarCafetera(){
        cantidadActual=0;
    }
    
    public void agregarCafe(int cantidadCafe){
        if((capacidadMaxima-cantidadActual)>=cantidadCafe){
            cantidadActual+=cantidadCafe;
        }else{
            cantidadActual=capacidadMaxima;
        }
    }
    
    //SET Y GET
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }    

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
