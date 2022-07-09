
package ejercicio2.entidades;

import java.util.ArrayList;

public class Cine {
    private Pelicula pelicula;
    private double precioEntrada;
    AsientoSalaCine s1;
    ArrayList<Espectador> espectadores=new ArrayList();

    public Cine(Pelicula pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        s1=new AsientoSalaCine();
    }
    
    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    
    
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public AsientoSalaCine getS1() {
        return s1;
    }

    public void setS1(AsientoSalaCine s1) {
        this.s1 = s1;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + '}';
    }

    public void agregarEspectador(Espectador esp){
        espectadores.add(esp);
    }
    
    
}
