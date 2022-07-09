package ejercicio8.entidades;

import ejercicio8.enumeraciones.TipoGimnasio;

/*@author Angel Gabriel Arévalo*/
public class Hotel4Estrellas extends Hotel3Estrellas{
    protected TipoGimnasio gym;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4Estrellas(TipoGimnasio gym, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numeroCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numeroCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }
    
    public double valorAgregadorRestaurante(){
        if(capacidadRestaurante>0 && capacidadRestaurante<30){
            return 10;
        }else if(cantHabitaciones<=50){
            return 30;
        }else{
            return 50;
        }
    }
    
    public double valorAgregadoGimnasio(){
        if(gym.toString().equals("A")){
            return 50;
        }else{
            return 30;
        }
    }

    @Override
    public double precioHabitacion() {
        return super.precioHabitacion()+valorAgregadoGimnasio()+valorAgregadorRestaurante(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "----------------------\nTipo de Alojamiento: Hotel 4 estrellas\nNombre: "+nombre+"\nDirección: "+direccion+"\nLocalidad: "+localidad+"\nGerente: "+gerente+"\nTipo de Gimnasio: "+gym.toString()+"\nNombre del Restaurante: "+nombreRestaurante+"\nCapacidad del restaurante: "+capacidadRestaurante;
    }
    
    
}
