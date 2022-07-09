package ejercicio9.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public final class Estudiante extends Persona{
    private String cursoEstudiante;
    private ArrayList<String> cursos=new ArrayList();
            
    public Estudiante(String cursoEstudiante, String nombrePersona, long dniPersona, String estadoCivilPersona) {
        super(nombrePersona, dniPersona, estadoCivilPersona);
        this.cursoEstudiante = cursoEstudiante;
        cursos.add(cursoEstudiante);
    }
    
    public void matricularNuevoCurso(){
        System.out.println("--------MATRICULAR CURSO----------");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese curso a matricular: ");
        String c=entrada.next();
        cursos.add(c);
        System.out.println("---------------CURSO MATRICULADO--------------");
    }

    @Override
    public String toString() {
        return "---------------------\nTipo: Estudiante\nNombre: "+nombrePersona+"\nDNI: "+dniPersona+"\nEstado Civil: "+estadoCivilPersona+"\nCursos: "+cursos;
    }
    
    
}
