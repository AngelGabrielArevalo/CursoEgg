package ejercicio8.entidades;

/*@author Angel Gabriel Arévalo*/
public class AlojamientoExtraHotelero extends Alojamiento{
    protected boolean privado;
    protected int cantMetrosCuadrados;

    public AlojamientoExtraHotelero(boolean privado, int cantMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    
    
    

}
