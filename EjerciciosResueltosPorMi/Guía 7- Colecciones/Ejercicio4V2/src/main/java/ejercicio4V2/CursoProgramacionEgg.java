package ejercicio4V2;

/*@author Angel Gabriel Arévalo*/
import ejercicio4V2.entidades.Alumno;
import ejercicio4V2.utilidades.Comparadores;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.*;

public class CursoProgramacionEgg {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(new Alumno("Angel", "Arevalo", "40461304", "M", "regular", 3));
        alumnos.add(new Alumno("Cristin", "Oronel", "20461304", "M", "regular", 133));
        alumnos.add(new Alumno("Pedro", "Hernandez", "19461304", "M", "condicional", 10));
        alumnos.add(new Alumno("Laura", "Perez", "9461304", "F", "condicional", 1));
        alumnos.add(new Alumno("Ernesto", "Gomez", "99461304", "M", "regular", 84));
        alumnos.add(new Alumno("Laura", "Perez", "9461304", "F", "condicional", 140));
        alumnos.add(new Alumno("Ernesto", "Gomez", "99461304", "M", "regular", 844));
        Collections.sort(alumnos);
        mostrarAlumnos(alumnos);
        eliminarRepetidos(alumnos);
        mostrarAlumnos(alumnos);
        ingresarAlumno(alumnos);
        mostrarAlumnos(alumnos);
//        alumnosCondicional(alumnos);
//        Collections.sort(alumnos, Comparadores.ordenarPorNotaDescendente);
//        mostrarAlumnos(alumnos);
//        Collections.sort(alumnos, Comparadores.ordenarPorNotaAscendente);
//        mostrarAlumnos(alumnos);
//        Collections.sort(alumnos, Comparadores.ordenarPorNombreyApellido);
//        mostrarAlumnos(alumnos);
        
    }

    public static void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        System.out.println("----------------------ALUMNOS----------------------------");
        alumnos.forEach(x ->System.out.println(x.toString()));
        System.out.println("---------------------------------------------------------");
    }

    public static void alumnosCondicional(ArrayList<Alumno> alumnos) {
        System.out.println("--------------------------ALUMNOS CONDICIONALES-------------------------------");
        Iterator<Alumno> it = alumnos.iterator();
        int cant = 0;
        while (it.hasNext()) {
            Alumno next = it.next();
            if (next.getCondicion().equals("condicional")) {
                System.out.println(next.toString());
                cant++;
            }
        }
        System.out.println("La cantidad de alumnos condicionales es " + cant);
        System.out.println("----------------------------------------------------");
    }
    
    public static void eliminarRepetidos(ArrayList<Alumno> alumnos){
        int cant=0;
        for (int i = 0; i < alumnos.size(); i++) {
            int aux=i+1;
            for (int j = aux; j < alumnos.size(); j++) {
                if(alumnos.get(i).getNumeroLegajo()==alumnos.get(j).getNumeroLegajo()){
                    alumnos.remove(j);
                    cant++;
                }
            }
        }
        System.out.println("Se han eliminado "+cant+" objetos con el mismo Número de Legajo.");
    }
    
    public static void ingresarAlumno(ArrayList<Alumno> alumnos){
        Scanner entrada=new Scanner(System.in).useDelimiter("\n");
        System.out.println("------------------INGRESE NUEVO ALUMNO---------------");
        System.out.println("Ingrese el nombre: ");
        String nombre=entrada.next();
        System.out.println("Ingrese número de legajo:");
        String nl;
        do{
            nl=entrada.next();
            if(existeLegajo(nl, alumnos)){
                System.out.println("El número de legajo ingresado ya existe. Vuelva a ingresar otro:");
            }
        }while(existeLegajo(nl, alumnos));
        alumnos.add(new Alumno(nombre, "Pepii", nl, "H", "regular", 10));
        
        
    }
    
    public static boolean existeLegajo(String nl, ArrayList<Alumno> alumnos){
        Iterator<Alumno> it=alumnos.iterator();
        while (it.hasNext()) {
            Alumno next = it.next();
            if(next.getNumeroLegajo().equals(nl)){
                return true;
            }
        }
        return false;
    }
    
}
