package ejercicio4;

/*@author Angel Gabriel Arévalo*/
import ejercicio4.entidades.Alumno;
import ejercicio4.utilidades.Comparadores;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.*;

public class CursoProgramacionEgg {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TreeSet<Alumno> alumnos = new TreeSet<Alumno>();
        alumnos.add(new Alumno("Angel", "Arevalo", "40461304", "M", "regular", 10));
        alumnos.add(new Alumno("Angel", "Arevalo", "0", "M", "regular", 10));
        alumnos.add(new Alumno("Angel", "Arevaalo", "404661304", "M", "regular", 10));
        alumnos.add(new Alumno("Cristin", "Oronel", "20461304", "M", "regular", 10));
        alumnos.add(new Alumno("Pedro", "Hernandez", "19461304", "M", "condicional", 10));
        alumnos.add(new Alumno("Laura", "Perez", "9461304", "F", "condicional", 10));
        alumnos.add(new Alumno("AErnesto", "Gomez", "99461304", "M", "regular", 84));
        alumnos.add(new Alumno("Earnesto", "Gomez", "99461304", "M", "regular", 85));
        alumnos.add(new Alumno("Ernesto", "Gaomez", "959461304", "M", "regular", 8));
       // System.out.println(String.valueOf(85.5)+"99461304");
        mostrarAlumnos(alumnos);
        alumnosCondicional(alumnos);
        alumnos=ordenarPorNotaDescendente(alumnos);
        mostrarAlumnos(alumnos);
        alumnos.add(new Alumno("Ernesto", "Gaomez", "959461304", "M", "regular", 8));
        mostrarAlumnos(alumnos);
//        alumnos=ordenarPorNotasAcsendete(alumnos);
//        mostrarAlumnos(alumnos);
//        alumnos=ordenarPorNombreyApellido(alumnos);
//        mostrarAlumnos(alumnos);
    }

    public static void mostrarAlumnos(TreeSet<Alumno> alumnos) {
        System.out.println("----------------------ALUMNOS----------------------------");
        alumnos.forEach(x ->System.out.println(x.toString()));
        System.out.println("---------------------------------------------------------");
    }

    public static void alumnosCondicional(TreeSet<Alumno> alumnos) {
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
    
    public static TreeSet<Alumno> ordenarPorNotaDescendente(TreeSet<Alumno> alumnos ){
        System.out.println("------------------NOTAS POR ORDEN DESCENDENTE-------------------------");
        TreeSet<Alumno> aux=new TreeSet<Alumno>(Comparadores.ordenarPorNotaDescendente);
        aux.addAll(alumnos);
        return aux;
    }
    
    public static TreeSet<Alumno> ordenarPorNotasAcsendete(TreeSet<Alumno> alumnos){
        System.out.println("------------------NOTAS POR ORDEN ASCENDENTE-------------------------");
        TreeSet<Alumno> aux=new TreeSet<Alumno>(Comparadores.ordenarPorNotaAscendente);
        aux.addAll(alumnos);
        return aux;
    }
    
    public static TreeSet<Alumno> ordenarPorNombreyApellido(TreeSet<Alumno> alumnos){
        System.out.println("------------------ORDENADO POR NOMBRE Y APELLIDO-------------------------");
        TreeSet<Alumno> aux=new TreeSet<Alumno>(Comparadores.ordenarPorNombreyApellido);
        aux.addAll(alumnos);
        return aux;
    }
    
}
