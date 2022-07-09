package ejercicio8;

/*@author Angel Gabriel Arévalo*/
import ejercicio8.entidades.Alojamiento;
import ejercicio8.entidades.AlojamientoExtraHotelero;
import ejercicio8.entidades.Camping;
import ejercicio8.entidades.Hotel;
import ejercicio8.entidades.Hotel3Estrellas;
import ejercicio8.entidades.Hotel4Estrellas;
import ejercicio8.entidades.Hotel5Estrellas;
import ejercicio8.entidades.Recidencia;
import ejercicio8.enumeraciones.TipoGimnasio;
import java.util.ArrayList;
import java.util.Scanner;

public class InfoAlojamiento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Alojamiento> alojamientos = new ArrayList<Alojamiento>();
        alojamientos.add(new Hotel3Estrellas(5, 3, 2, 2000, "La Farola", "Ezeiza 213", "Ezeiza", "El peke"));
        alojamientos.add(new Hotel4Estrellas(TipoGimnasio.A, "La Fontaine", 5, 6, 1, 3, 2500, "Casa Feliz", "Polvorines 234", "Ezeiza", "El Xocas"));
        alojamientos.add(new Hotel5Estrellas(1, 2, 4, TipoGimnasio.A, "Panzita feliz", 10, 9, 2, 3, 3000, "La Fontaine", "El pirulo 321", "Virrey", "Angel"));
        alojamientos.add(new Camping(50, 10, true, true, 100, "Pescado Feliz", "Alborada 2345", "Polvorines", "El mascapito"));
        alojamientos.add(new Recidencia(10, true, true, false, 20, "Pepito", "La Boca 324", "Ezeiza", "Messi"));
        mostrarAlojamientos(alojamientos);
        mostrarHotelesPorLocalidad(alojamientos);
        mostrarCampingPorLocalidad(alojamientos);
    }

    public static void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos){
        System.out.println("------------------TODOS LOS ALOJAMIENTOS----------------------------");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.toString());
        }
        System.out.println("---------------------------------------------");
    }
    
    public static void mostrarHotelesPorLocalidad(ArrayList<Alojamiento> alojamientos){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese localidad:");
        String localidad=entrada.next();
        
        System.out.println("------------------HOTELES DE "+localidad.toUpperCase()+"----------------------------");
        for (Alojamiento alojamiento : alojamientos) {
            if(alojamiento instanceof Hotel && alojamiento.getLocalidad().equals(localidad)){
                System.out.println(alojamiento.toString());
            }
        }
        System.out.println("---------------------------------------------");
    }
    
    public static void mostrarCampingPorLocalidad(ArrayList<Alojamiento> alojamientos){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese localidad:");
        String localidad=entrada.next();
        System.out.println("------------------CAMPINGS DE "+localidad.toUpperCase()+"----------------------------");
        for (Alojamiento alojamiento : alojamientos) {
            if(alojamiento instanceof AlojamientoExtraHotelero && alojamiento.getLocalidad().equals(localidad)){
                System.out.println(alojamiento.toString());
            }
        }
        System.out.println("---------------------------------------------");
    }
    
}
