package ejercicio8.entidades;

/*@author Angel Gabriel Arévalo*/
public final class Recidencia extends AlojamientoExtraHotelero{
    private int cantHabitaciones;
    private boolean descuentoGremio;
    private boolean campoDeportivo;

    public Recidencia(int cantHabitaciones, boolean descuentoGremio, boolean campoDeportivo, boolean privado, int cantMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
       return "--------------------------\nTipo de Alojamiento: Camping\nNombre: "+nombre+"\nDirección: "+direccion+"\nLocalidad: "+localidad+"\nGerente: "+gerente+"\nEs privado: "+privado+"\nCantidad de m2: "+cantMetrosCuadrados+"\nCantidad de habitaciones: "+cantHabitaciones+"\nPosee descuento por gremio: "+descuentoGremio+"\nPosee campo deportivo: "+campoDeportivo;
    }

    
    
}
