package extraA.comparadores;

import extraA.entidades.Alumno;
import java.util.Comparator;

/*@author Angel Gabriel Arévalo*/
public class Comparadores implements Comparator<Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getCantVotos()-o2.getCantVotos();
        
    }

}
