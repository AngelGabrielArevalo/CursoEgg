
package ejercicio2;

// @author Angel Arévalo

import ejercicio2.entidades.Cine;
import ejercicio2.entidades.Espectador;
import ejercicio2.entidades.Pelicula;
import ejercicio2.entidades.AsientoSalaCine;
import java.util.ArrayList;
import java.util.Scanner;



public class PeliculaCine {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("------------------CINE----------------------");  
        Pelicula pelicula=new Pelicula("Avengers End Game", "El Tobii Paa", 140, 16);
        Cine cine=new Cine(pelicula, 400);
        System.out.println("Pelicula: "+cine.getPelicula().getTitulo());
        System.out.println("Director: "+cine.getPelicula().getDirector());
        System.out.println("Duración: "+cine.getPelicula().getDuracion()+" minutos.");
        System.out.println("Edad Minima: "+cine.getPelicula().getEdadMinima()+" años.");
        System.out.println("Precio de la entrada: $"+cine.getPrecioEntrada());
        System.out.println("----------------------------------------------------");
        System.out.println("-----------------------DISPOSICIÓN DE ASIENTOS------------------");
        cine.getS1().mostrarAsientos();
        System.out.println("----------------------------------------");
        System.out.println("------------------ESPECTADORES----------------------");
        generarEspectadores(cine, 600);
        //cine.getEspectadores().forEach(x->System.out.println(x.toString()));
        System.out.println("-------------------------------------------");
        ubicarEspectadores(cine);
        cantidadAsientosOcupados(cine);
        System.out.println("--------------------");
        espectadorAsiento(cine);
    }
    
    public static void generarEspectadores(Cine c, int cant){
        for (int i = 0; i < cant; i++) {
            int edad=(int)(Math.random()*51);
            double dinero=Math.random()*600;
            c.agregarEspectador(new Espectador(("Espectador "+(i+1)), edad, dinero));
        }
    }
    
    public static void ubicarEspectadores(Cine c){
        ArrayList<Espectador> e=c.getEspectadores();
        ArrayList<AsientoSalaCine> s=c.getS1().getAsientos();
        int numAsiento;
        for (int i = 0; i < e.size(); i++) {
            System.out.println("--------------UBICANDO ESPECTADOR: "+e.get(i).getNombre()+"---------------------");
            if(!asientoDisponible(c)){
                System.out.println("Ya no quedan asientos disponibles!!!!!");
                System.out.println("----------------------------------------------");
                break;
            }
            do{
                numAsiento=(int)(Math.random()*(s.size()));
            }while(s.get(numAsiento).isOcupado());
            if(e.get(i).getDineroDisponible()>=c.getPrecioEntrada() && e.get(i).getEdad()>=c.getPelicula().getEdadMinima()){
                s.get(numAsiento).setOcupado(true);
                s.get(numAsiento).setEspectador(e.get(i));
                System.out.println("Se ubicó a "+e.get(i).getNombre()+" en el asiento "+""+s.get(numAsiento).getFilaAsiento()+""+s.get(numAsiento).getColumnaAsiento());
                System.out.println("------------------------------------");
            }else{
                if(e.get(i).getDineroDisponible()<c.getPrecioEntrada()){
                    System.out.println(e.get(i).getNombre()+" no cuenta con el dinero suficiente para ver la pelicula.");
                }
                if(e.get(i).getEdad()<c.getPelicula().getEdadMinima()){
                    System.out.println(e.get(i).getNombre()+" no cuenta con el la edad minima para ver la pelicula.");
                }
                System.out.println("-----------------------------------------------");
            }
        }
    }
    
    public static boolean asientoDisponible(Cine c){
        for (int i = 0; i < c.getS1().getAsientos().size(); i++) {
            if(!c.getS1().getAsientos().get(i).isOcupado()){
                return true;
            }
        }
        return false;
    }
    
    
    public static void cantidadAsientosOcupados(Cine c){
        int cantO=0;
        int cantD=0;
        for (int i = 0; i < c.getS1().getAsientos().size(); i++) {
            if(c.getS1().getAsientos().get(i).isOcupado()){
                cantO++;
            }else{
                cantD++;
            }
        }
        System.out.println("Asientos ocupados: "+cantO);
        System.out.println("Asientos disponibles: "+cantD);
    }
    
    public static void espectadorAsiento(Cine c){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese fila y columna del asiento que desea ver: ");
        int fila=entrada.nextInt();
        String columna=entrada.next();
        char aux=columna.charAt(0);
        for (int i = 0; i < c.getS1().getAsientos().size(); i++) {
            if(c.getS1().getAsientos().get(i).getFilaAsiento()==fila && c.getS1().getAsientos().get(i).getColumnaAsiento()==(aux)){
                System.out.println(c.getS1().getAsientos().get(i).getEspectador().toString());
                System.out.println("---!!!-------");
            }
        }
    }
}
