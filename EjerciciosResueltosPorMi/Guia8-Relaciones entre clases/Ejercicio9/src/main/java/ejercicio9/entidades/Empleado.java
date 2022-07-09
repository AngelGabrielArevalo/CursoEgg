package ejercicio9.entidades;

import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class Empleado extends Persona{
    protected int anioIncorporacionEmpleado;
    protected int numDespachoEmpleado;

    public Empleado(int anioIncorporacionEmpleado, int numDespachoEmpleado, String nombrePersona, long dniPersona, String estadoCivilPersona) {
        super(nombrePersona, dniPersona, estadoCivilPersona);
        this.anioIncorporacionEmpleado = anioIncorporacionEmpleado;
        this.numDespachoEmpleado = numDespachoEmpleado;
    }
    
    public void reasignarDespacho(){
        System.out.println("------------REASIGNAR DESPACHO----------------");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el número de despacho al que será reasignado: ");
        int nd=entrada.nextInt();
        numDespachoEmpleado=nd;
        System.out.println("------------DESPACHO REASIGNADO----------------");
              
    }
}
