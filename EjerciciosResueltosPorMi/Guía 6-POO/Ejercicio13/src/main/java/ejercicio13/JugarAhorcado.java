package ejercicio13;

/*@author Angel Gabriel Arévalo*/
import ejercicio13.entidades.Ahorcado;
import ejercicio13.servicios.ServicioAhorcado;
import java.util.Scanner;

public class JugarAhorcado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioAhorcado sa = new ServicioAhorcado();
        Ahorcado a = sa.crearAhorcado();
        char letra;
        a.mostrarLongitud();
        System.out.println(a.getPalabraaBusbar());
        while(!a.palabraCompleta() && a.getCantidadIntentos()>0){
            System.out.println("Ingrese una letra:");
            letra=entrada.next().charAt(0);
            System.out.println(letra);
            a.informe(letra);
            a.encontradas();
            System.out.println("Número de oportunidades restantes: "+a.getCantidadIntentos());
            System.out.print("Estado actual: ");
            a.mostrarEncontradas();          
        }
        if(a.palabraCompleta()){
            System.out.println("Felicitaciones!!!!!");
        }else if(a.getCantidadIntentos()==0){
            System.out.println("Lo sentimos, no hay más intentos!");
        }
    }

}
