package ejercicio9.entidades;

import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class Persona {
    protected String nombrePersona;
    protected long dniPersona;
    protected String estadoCivilPersona;

    public Persona(String nombrePersona, long dniPersona, String estadoCivilPersona) {
        this.nombrePersona = nombrePersona;
        this.dniPersona = dniPersona;
        this.estadoCivilPersona = estadoCivilPersona;
    }

    public void cambiarEstadoCivil(){
        System.out.println("-------------CAMBIO DE ESTADO CIVIL--------------------");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el nuevo estado civil:");
        String es=entrada.next();
        estadoCivilPersona=es;
        System.out.println("-----------SE HA CAMBIADO EL ESTADO CIVIL--------------");
    }
    
    
}
