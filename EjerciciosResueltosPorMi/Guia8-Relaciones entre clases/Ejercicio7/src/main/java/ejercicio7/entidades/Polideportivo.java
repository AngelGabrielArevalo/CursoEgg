package ejercicio7.entidades;

import ejercicio7.enumeraciones.TipoDeInstalacion;
import ejercicio7.interfaces.Edificio;
import ejercicio7.interfaces.InstalacionDeportiva;

/*@author Angel Gabriel Arévalo*/
public class Polideportivo implements InstalacionDeportiva, Edificio{
    private int largo;
    private int ancho;
    private String nombre;
    TipoDeInstalacion tipoInstalacion;

    @Override
    public int tipoDeInstalacion() {
        return tipoInstalacion.getCodigo().intValue();
    }

    @Override
    public double calcularSuperficie() {
        return (double)(largo*ancho);
    }

    public Polideportivo(int largo, int ancho, String nombre, TipoDeInstalacion tipoInstalacion) {
        this.largo = largo;
        this.ancho = ancho;
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDeInstalacion getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(TipoDeInstalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    
    
    @Override
    public String toString() {
        return "Polideportivo{" + "largo=" + largo + ", ancho=" + ancho + ", nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion.getValor() + '}';
    }
    
    
    
    
}
