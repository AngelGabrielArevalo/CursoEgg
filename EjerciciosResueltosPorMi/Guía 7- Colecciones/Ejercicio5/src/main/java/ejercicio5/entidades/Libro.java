package ejercicio5.entidades;

import java.util.Objects;

/*@author Angel Gabriel Arévalo*/
public class Libro {
    private String tiutlo, autor;
    private int numEjemplares, numPrestados;

    public Libro() {
    }

    public Libro(String tiutlo, String autor, int numEjemplares, int numPrestados) {
        this.tiutlo = tiutlo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    public String getTiutlo() {
        return tiutlo;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }
    
    public boolean prestamo(){
        if((numEjemplares-numPrestados)>0){
            numPrestados++;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean devolucion(){
        if(numPrestados>0){
            numPrestados--;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "tiutlo=" + tiutlo + ", autor=" + autor + ", numEjemplares=" + numEjemplares + ", numPrestados=" + numPrestados + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.tiutlo);
        hash = 59 * hash + Objects.hashCode(this.autor);
        hash = 59 * hash + this.numEjemplares;
        hash = 59 * hash + this.numPrestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.tiutlo, other.tiutlo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
    
    
}
