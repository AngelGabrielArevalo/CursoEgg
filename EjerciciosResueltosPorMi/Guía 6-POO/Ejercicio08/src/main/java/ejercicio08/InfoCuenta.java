package ejercicio08;

/*@author Angel Gabriel Arévalo*/
import ejercicio08.entidades.Cuenta;
import ejercicio08.servicios.ServicioCuenta;
import java.util.Scanner;

public class InfoCuenta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta c1 = sc.crearCuenta();
        System.out.println(c1.toString());
        System.out.println("Ingrese saldo que desee agregar:");
        double saldo=entrada.nextDouble();
        c1.ingresar(saldo);
        System.out.println(c1.toString());
        System.out.println("Ingrese saldo que desee devitar:");
        double saldodev=entrada.nextDouble();
        c1.retirar(saldodev);
        System.out.println(c1.toString());
    }

}
