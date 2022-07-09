package ejercicio9.entidades;

import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public final class Profesor extends Empleado{
    private String departamentoProfesor;

    public Profesor(String departamentoProfesor, int anioIncorporacionEmpleado, int numDespachoEmpleado, String nombrePersona, long dniPersona, String estadoCivilPersona) {
        super(anioIncorporacionEmpleado, numDespachoEmpleado, nombrePersona, dniPersona, estadoCivilPersona);
        this.departamentoProfesor = departamentoProfesor;
    }
    
    public void cambiarDepartamento(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("---------CAMBIAR DEPARTAMENTO-----------");
        System.out.println("Ingrese nuevo departamento:");
        String nd=entrada.next();
        departamentoProfesor=nd;
        System.out.println("--------DEPARTAMENTO CAMBIADO-----------");
    }

    @Override
    public String toString() {
        return "-------------------------------\nTipo: Profesor\nNombre: "+nombrePersona+"\nDNI: "+dniPersona+"\nEstado Civil: "+estadoCivilPersona+"\nDepartamento: "+departamentoProfesor;
    }
    
    
}
