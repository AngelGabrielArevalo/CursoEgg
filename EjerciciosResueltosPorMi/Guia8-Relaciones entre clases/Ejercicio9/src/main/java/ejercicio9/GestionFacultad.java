package ejercicio9;

/*@author Angel Gabriel Arévalo*/
import ejercicio9.entidades.Estudiante;
import ejercicio9.entidades.Persona;
import ejercicio9.entidades.PersonalServicio;
import ejercicio9.entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionFacultad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList();
        personas.add(new Estudiante("Programación", "Angel", 40461304, "Soltero"));
        personas.add(new Profesor("Informática", 2010, 1234, "Eduardo", 32456842, "Casado"));
        personas.add(new PersonalServicio("Biblioteca", 2018, 523, "Felipe", 23432654, "Casado"));

        personas.forEach(x -> System.out.println(x.toString()));

        Estudiante est = (Estudiante) personas.get(0);
        est.matricularNuevoCurso();

        System.out.println(personas.get(0).toString());
    }

}
