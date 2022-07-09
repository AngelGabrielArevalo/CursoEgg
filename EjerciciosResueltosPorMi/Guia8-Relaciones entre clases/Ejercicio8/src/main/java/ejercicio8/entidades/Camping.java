package ejercicio8.entidades;

/*@author Angel Gabriel Arévalo*/
public final class Camping extends AlojamientoExtraHotelero{
    private int cantMaximaCarpas;
    private int cantBanios;
    private boolean poseeRestaurante;

    public Camping(int cantMaximaCarpas, int cantBanios, boolean poseeRestaurante, boolean privado, int cantMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantMaximaCarpas = cantMaximaCarpas;
        this.cantBanios = cantBanios;
        this.poseeRestaurante = poseeRestaurante;
    }

    @Override
    public String toString() {
        return "--------------------------\nTipo de Alojamiento: Camping\nNombre: "+nombre+"\nDirección: "+direccion+"\nLocalidad: "+localidad+"\nGerente: "+gerente+"\nEs privado: "+privado+"\nCantidad de m2: "+cantMetrosCuadrados+"\nCantidad Máxima de carpas: "+cantMaximaCarpas+"\nCantidad de baños: "+cantBanios+"\nPesee retaurante: "+poseeRestaurante;
    }
    
    
    
}
