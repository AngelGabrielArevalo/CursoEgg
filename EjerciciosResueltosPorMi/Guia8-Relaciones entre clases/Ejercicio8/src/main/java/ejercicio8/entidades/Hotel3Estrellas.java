package ejercicio8.entidades;

import ejercicio8.enumeraciones.TipoGimnasio;

/*@author Angel Gabriel Arévalo*/
public class Hotel3Estrellas extends Hotel{

    public Hotel3Estrellas(int cantHabitaciones, int numeroCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numeroCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
    }

    @Override
    public double precioHabitacion() {
        return 50+(cantHabitaciones*cantPisos*numeroCamas);
    }

    @Override
    public String toString() {
        return "--------------------------\nTipo de Alojamiento: Hotel 3 estrellas\nNombre: "+nombre+"\nDirección: "+direccion+"\nLocalidad: "+localidad+"\nGerente: "+gerente;
    }
}
