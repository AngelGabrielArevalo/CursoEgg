package ejercicio5;

/*@author Angel Gabriel Arévalo*/
import ejercicio5.entidades.Electrodomestico;
import ejercicio5.entidades.Lavadora;
import ejercicio5.entidades.Televisor;
import java.util.Scanner;

public class InfoElectrodomesticos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Lavadora(500, "Negro", 'A', 30, 40);
        electrodomesticos[1] = new Lavadora(300, "Negro", 'D', 20, 8);
        electrodomesticos[2] = new Lavadora(400, "Gris", 'j', 35, 15);
        electrodomesticos[3] = new Lavadora(600, "Rojo", 'B', 70, 30);
        electrodomesticos[4] = new Lavadora(550, "Negro", 'A', 30, 10);
        electrodomesticos[5] = new Televisor(700, "Gris", 'B', 10, 55, true);
        electrodomesticos[6] = new Televisor(700, "Gris", 'B', 8, 32, false);
        electrodomesticos[7] = new Televisor(700, "Rojo", 'A', 15, 65, true);
        electrodomesticos[8] = new Televisor(700, "Gris", 'D', 10, 45, false);
        electrodomesticos[9] = new Televisor(700, "Gris", 'B', 10, 55, true);
        double precioLavadoras=0;
        double precioTelevisores=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("-------------------------------");
            System.out.println(electrodomesticos[i].toString());
            electrodomesticos[i].precioFinal();
            System.out.println(electrodomesticos[i].toString());
            if(electrodomesticos[i] instanceof Lavadora){
                precioLavadoras+=electrodomesticos[i].getPrecioBase();
            }
            if(electrodomesticos[i] instanceof Televisor){
                precioTelevisores+=electrodomesticos[i].getPrecioBase();
            }
            System.out.println("------------------------");
        }
        System.out.println("PRECIO DE LAS LAVADORAS: "+precioLavadoras);
        System.out.println("PRECIO DE LOS TELEVISORES: "+precioTelevisores);
        System.out.println("PRECIO TOTAL: "+(precioLavadoras+precioTelevisores));
    }

}
