package ejercicio17;

/*@author Angel Gabriel Arévalo*/
import ejercicio17.entidades.Meses;
import java.util.Scanner;

public class AdivinaMeses {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Meses m1=new Meses();
        m1.setearMesSecreto();
        System.out.println(m1.getMesSecreto());
        String mesIngresado;
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        
        do{
            mesIngresado=entrada.next();
            if(m1.adivinaMes(mesIngresado)){
                System.out.println("Ha acertado!!!!");
            }else{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            }
            
        }while(!m1.adivinaMes(mesIngresado));
    }

}
