package ejercicio4.utilidades;

import ejercicio4.entidades.Alumno;
import java.util.Comparator;

/*@author Angel Gabriel Arévalo*/
public class Comparadores {
    
    public static Comparator<Alumno> ordenarPorNotaDescendente=new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            String aux1=String.valueOf(o1.getNotaFinal())+o1.getNumeroLegajo();
            String aux2=String.valueOf(o2.getNotaFinal())+o2.getNumeroLegajo();
            double a=Double.parseDouble(aux1);
            double b=Double.parseDouble(aux2);
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
            String aux1=String.valueOf(o1.getNotaFinal())+o1.getNumeroLegajo();
            String aux2=String.valueOf(o2.getNotaFinal())+o2.getNumeroLegajo();
            double a=Double.parseDouble(aux1);
            double b=Double.parseDouble(aux2);
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
            return (o1.getNombre()+o1.getApellido()+o1.getNumeroLegajo()).compareTo(o2.getNombre()+o2.getApellido()+o2.getNumeroLegajo());
        }
    };
    
}
