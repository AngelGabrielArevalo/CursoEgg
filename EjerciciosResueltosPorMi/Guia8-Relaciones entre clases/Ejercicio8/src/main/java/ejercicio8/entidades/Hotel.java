package ejercicio8.entidades;

/*@author Angel Gabriel Arévalo*/
public abstract class Hotel extends Alojamiento{
    protected int cantHabitaciones;
    protected int numeroCamas;
    protected int cantPisos;
    protected double precioHabitacion;

    public Hotel(int cantHabitaciones, int numeroCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }
    
    public abstract double precioHabitacion();

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    
}
