package ejercicio7.entidades;

import ejercicio7.interfaces.Edificio;

/*@author Angel Gabriel Arévalo*/
public class EdificioDeOficinas implements Edificio{
    private int numeroOficinas;
    private int ancho;
    private int largo;
    private int numeroPisos;

    public EdificioDeOficinas(int numeroOficinas, int ancho, int largo, int numeroPisos) {
        this.numeroOficinas = numeroOficinas;
        this.ancho = ancho;
        this.largo = largo;
        this.numeroPisos = numeroPisos;
    }

    
    
    @Override
    public double calcularSuperficie() {
        return (double)(numeroOficinas*numeroPisos*ancho*largo);
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numeroOficinas=" + numeroOficinas + ", ancho=" + ancho + ", largo=" + largo + ", numeroPisos=" + numeroPisos + '}';
    }
    
    
}
