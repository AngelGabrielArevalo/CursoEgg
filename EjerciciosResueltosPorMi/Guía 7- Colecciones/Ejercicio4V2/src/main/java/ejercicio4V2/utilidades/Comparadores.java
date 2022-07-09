package ejercicio4V2.utilidades;

import ejercicio4V2.entidades.Alumno;
import java.util.Comparator;

/*@author Angel Gabriel Arévalo*/
public class Comparadores {
    
    public static Comparator<Alumno> ordenarPorNotaDescendente=new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            double a=o1.getNotaFinal();
            double b=o2.getNotaFinal();
            if(a<b){
                return 1;
            }else if(a==b){
                return 0;
            }else{
                return -1;
            }
        }
    };
    
    public static Comparator<Alumno> ordenarPorNotaAscendente=new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            double a=o1.getNotaFinal();
            double b=o2.getNotaFinal();
            if(a>b){
                return 1;
            }else if(a==b){
                return 0;
            }else{
                return -1;
            }
        }
    };
    
    public static Comparator<Alumno> ordenarPorNombreyApellido=new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return (o1.getNombre()+o1.getApellido()).compareTo(o2.getNombre()+o2.getApellido());
        }
    };
    
}
