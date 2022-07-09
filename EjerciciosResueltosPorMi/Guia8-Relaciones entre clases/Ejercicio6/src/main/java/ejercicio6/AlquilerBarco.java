
package ejercicio6;

// @author Angel Arévalo

import ejercicio6.entidades.Alquiler;
import ejercicio6.entidades.Barco;
import ejercicio6.entidades.EmbarcacionDeportivaaMotor;
import ejercicio6.entidades.Velero;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;



public class AlquilerBarco {

    public static void main(String[] args) {
        Calendar calendario1=new GregorianCalendar();
        Calendar calendario2=new GregorianCalendar();
        calendario1.set(2020, 0, 1);
        Barco b1=new Velero(3, "XYZ 223", 15, calendario1.getTime());
        calendario1.set(2022, 0, 19);
        calendario2.set(2022, 0, 25);
        Alquiler a1=new Alquiler("Angel", 40461304, calendario1.getTime(), calendario2.getTime(), "Firme xD", b1);
        System.out.println(a1.toString());
        System.out.println("Precio alquiler: $"+a1.precioAlquiler());
        calendario1.set(2015, 5, 10);
        Barco b2=new EmbarcacionDeportivaaMotor(10, "XYZ 223", 15, calendario1.getTime());
        calendario1.set(2022, 0, 19);
        calendario2.set(2022, 0, 25);
        Alquiler a2=new Alquiler("Angel", 40461304, calendario1.getTime(), calendario2.getTime(), "Firme xD", b2);
        System.out.println(a2.toString());
        System.out.println("Precio alquiler: $"+a2.precioAlquiler());
    }

}
