package ejercicio9.entidades;

import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public final class PersonalServicio extends Empleado{
    private String seccionAsignadaPS;

    public PersonalServicio(String seccionAsignadaPS, int anioIncorporacionEmpleado, int numDespachoEmpleado, String nombrePersona, long dniPersona, String estadoCivilPersona) {
        super(anioIncorporacionEmpleado, numDespachoEmpleado, nombrePersona, dniPersona, estadoCivilPersona);
        this.seccionAsignadaPS = seccionAsignadaPS;
    }
    
    public void trasladoDeSeccion(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("---------TRASLADO DE SECCIN-----------");
        System.out.println("Ingrese nueva sección:");
        String ns=entrada.next();
        seccionAsignadaPS=ns;
        System.out.println("--------SE HA TRASLADADO AL EMPLEADO DE SECCION-----------");
    }

    @Override
    public String toString() {
        return "---------------------------------------\nTipo: Estudiante\nNombre: "+nombrePersona+"\nDNI: "+dniPersona+"\nEstado Civil: "+estadoCivilPersona+"\nSección Asignada: "+seccionAsignadaPS;
    }
    
    
}
