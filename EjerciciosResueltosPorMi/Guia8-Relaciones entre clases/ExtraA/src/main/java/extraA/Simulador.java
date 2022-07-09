package extraA;

/*@author Angel Gabriel Arévalo*/
import extraA.entidades.Alumno;
import extraA.utilidades.Comparadores;
import extraA.entidades.Voto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Simulador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Alumno> alumnos;
        ArrayList<Alumno> facilitadores;
        ArrayList<Voto> votos=new ArrayList();
        alumnos=generarAlumnosAleatorio(20);
        generarDni(alumnos);
        mostrarAlumnos(alumnos);
        votos=votacion(alumnos);
        mostrarAlumnos(alumnos);
        mostrarVotos(votos);
        recuentoVotos(alumnos);
        facilitadores=facilitadores(alumnos);
        mostrarFacilitadores(facilitadores);
    }

    public static ArrayList<Alumno> generarAlumnosAleatorio(int cant) {
        String[] nombre = {"Angel", "Pedro", "Juan", "Lorenzo", "Tamara", "Brisa", "Lorena"};
        String[] apellido = {"Perez", "Diaz", "Olmedo", "Gutierrez", "Ledesma", "Arevalo", "Melo"};
        ArrayList<Alumno> alumnos = new ArrayList();
        int r1;
        int r2;
        for (int i = 0; i < cant; i++) {
            r1 = (int) (Math.random() * (nombre.length));
            r2 = (int) (Math.random() * (apellido.length));
            alumnos.add(new Alumno(nombre[r1], apellido[r2], 0, 0));
        }
        return alumnos;
    }

    public static void generarDni(ArrayList<Alumno> alumnos) {
        long dni;
        for (int i = 0; i < alumnos.size(); i++) {
            dni = 20000000 + (long) (Math.random() * 80000000);
            alumnos.get(i).setDni(dni);
        }
    }

    public static void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        System.out.println("------------ALUMNOS------------------------");
        alumnos.forEach(x -> System.out.println(x.toString()));
        System.out.println("-------------------------------------------");
    }
    
    public static void mostrarVotos(ArrayList<Voto> votos) {
        System.out.println("------------VOTOS------------------------");
        votos.forEach(x -> System.out.println(x.toString()));
        System.out.println("-------------------------------------------");
    }
    
    public static void mostrarFacilitadores(ArrayList<Alumno> facilitadores) {
        Collections.sort(facilitadores, Comparadores.ordenatVotosDescendente);
        System.out.println("------------FACILITADORES------------------------");
        System.out.println("Titulares:");
        for (int i = 0; i < facilitadores.size()/2; i++) {
            System.out.println(facilitadores.get(i).toString());
        }
        System.out.println("Suplentes:");
        for (int i = ((facilitadores.size()/2)-1); i < facilitadores.size(); i++) {
            System.out.println(facilitadores.get(i).toString());
        }
        System.out.println("-------------------------------------------");
    }
    
    public static ArrayList<Voto> votacion(ArrayList<Alumno> alumnos){
        Voto alumnoVotante;
        HashSet<Alumno> alumnosVotados=new HashSet();
        ArrayList<Voto> votos=new ArrayList();
        int ra;
        int aux;
        for (int i = 0; i < alumnos.size(); i++) {
            alumnoVotante=new Voto();
            alumnoVotante.setAlumnoVotante(alumnos.get(i));
            while(alumnosVotados.size()<3){
                aux=alumnosVotados.size();
                ra=(int)(Math.random()*alumnos.size());
                alumnosVotados.add(alumnos.get(ra));
                if(alumnosVotados.size()>aux){
                    alumnos.get(ra).setCantVotos(alumnos.get(ra).getCantVotos()+1);
                }  
            }
            alumnoVotante.setearListaVotados(alumnosVotados);
            votos.add(alumnoVotante);
            alumnosVotados.clear();
        }
        return votos;
    }
    
    public static void recuentoVotos(ArrayList<Alumno> alumnos){
        int cantVotos=0;
        
        for (Alumno alumno : alumnos) {
            cantVotos+=alumno.getCantVotos();
        }
        System.out.println("-------------------VOTOS------------------");
        
        System.out.println("Cantidad de votos= "+cantVotos);
        Collections.sort(alumnos, Comparadores.ordenatVotosDescendente);
        mostrarAlumnos(alumnos);
    }
    
    public static ArrayList<Alumno> facilitadores(ArrayList<Alumno> alumnos){
        Collections.sort(alumnos, Comparadores.ordenatVotosDescendente);
        ArrayList<Alumno> facilitadores=new ArrayList();
        for (int i = 0; i < 10; i++) {
            facilitadores.add(alumnos.get(i));
        }
        return facilitadores;
    }
    
    

}
