package ejercicio4V2.entidades;

import java.util.Objects;

/*@author Angel Gabriel Arévalo*/
public class Alumno implements Comparable<Alumno>{

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
    public int compareTo(Alumno o) {
        return (this.nombre+this.apellido).compareTo(o.getNombre()+o.getApellido());
    }

    

    

    
}
