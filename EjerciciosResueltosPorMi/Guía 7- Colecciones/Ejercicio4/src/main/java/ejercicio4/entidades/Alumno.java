package ejercicio4.entidades;

import java.util.Objects;

/*@author Angel Gabriel Arévalo*/
public class Alumno implements Comparable<Alumno> {

    private String nombre, apellido, numeroLegajo, sexo, condicion;
    private double notaFinal;

    public Alumno(String nombre, String apellido, String numeroLegajo, String sexo, String condicion, double notaFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroLegajo = numeroLegajo;
        this.sexo = sexo;
        this.condicion = condicion;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(String numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", numeroLegajo=" + numeroLegajo + ", sexo=" + sexo + ", condicion=" + condicion + ", notaFinal=" + notaFinal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.apellido);
        hash = 83 * hash + Objects.hashCode(this.numeroLegajo);
        hash = 83 * hash + Objects.hashCode(this.sexo);
        hash = 83 * hash + Objects.hashCode(this.condicion);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.notaFinal) ^ (Double.doubleToLongBits(this.notaFinal) >>> 32));
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.numeroLegajo, other.numeroLegajo)) {
            return false;
        }
        return true;
    }

    

    @Override
    public int compareTo(Alumno o) {
        return this.numeroLegajo.compareTo(o.getNumeroLegajo());
    }
}
