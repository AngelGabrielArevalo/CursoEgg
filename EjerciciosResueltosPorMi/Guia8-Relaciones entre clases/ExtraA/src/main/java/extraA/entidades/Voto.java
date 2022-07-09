package extraA.entidades;

import java.util.ArrayList;
import java.util.HashSet;

/*@author Angel Gabriel Arévalo*/
public class Voto {
    Alumno alumnoVotante;
    ArrayList<Alumno> alumnosVotados=new ArrayList();

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }
    
    public void votarAlumno(Alumno a){
        alumnosVotados.add(a);
    }
    
    public void setearListaVotados(HashSet<Alumno> av){
        alumnosVotados=new ArrayList(av);
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnoVotante=" + alumnoVotante + ", alumnosVotados=" + alumnosVotados + '}';
    }
    
    
}
