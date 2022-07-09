package ejercicio8.entidades;

import ejercicio8.enumeraciones.TipoGimnasio;

/*@author Angel Gabriel Arévalo*/
public final class Hotel5Estrellas extends Hotel4Estrellas{
    private int cantSalonesConferencia;
    private int cantSuits;
    private int cantLimosinas;

    public Hotel5Estrellas(int cantSalonesConferencia, int cantSuits, int cantLimosinas, TipoGimnasio gym, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numeroCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gym, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numeroCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuits = cantSuits;
        this.cantLimosinas = cantLimosinas;
    }
    
    public double valorAgregadoLimosinas(){
        return 15*cantLimosinas;
    }

    @Override
    public double precioHabitacion() {
        return super.precioHabitacion()+valorAgregadoLimosinas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "----------------------------\nTipo de Alojamiento: Hotel 5 estrellas\nNombre: "+nombre+"\nDirección: "+direccion+"\nLocalidad: "+localidad+"\nGerente: "+gerente+"\nTipo de Gimnasio: "+gym.toString()+"\nNombre del Restaurante: "+nombreRestaurante+"\nCapacidad del restaurante: "+capacidadRestaurante+"\nSalones de Conferencia: "+cantSalonesConferencia+"\nSuits: "+cantSuits+"\nLimosinas: "+cantLimosinas+".";
    }


    
    
    
    
    
}
