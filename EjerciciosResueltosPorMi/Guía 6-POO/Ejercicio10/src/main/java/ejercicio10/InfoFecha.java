
package ejercicio10;

// @author Angel Arévalo

import ejercicio10.entidades.Fecha;
import ejercicio10.servicios.ServicioFecha;
import java.util.Scanner;



public class InfoFecha {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ServicioFecha sf=new ServicioFecha();
        Fecha f1=sf.crearFecha();
//        Fecha f2=sf.crearFecha();
//        System.out.println(f1.getFecha());
//        f1.validar();
//        System.out.println(f1.getFecha());
//        f1.leer();
//        System.out.println(f1.getFecha());
//        System.out.println(f1.diasMes(2));
        System.out.println(f1.diasTranscurridos());
//        System.out.println(f1.diasEntre(f2));
        System.out.println(f1.diaSiguiente());
        System.out.println(f1.diaAnterior());
    }

}
