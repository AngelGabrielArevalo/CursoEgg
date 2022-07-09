
package ejercicio14;

// @author Angel Arévalo

import ejercicio14.entidades.Persona;
import java.util.Scanner;



public class InfoPersona {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("PESONA1:");
        System.out.println("Introducir nombre: ");
        String nombre=entrada.next();
        System.out.println("Introducir edad:");
        int edad=entrada.nextInt();
        System.out.println("Introducir sexo:");
        char sexo=entrada.next().charAt(0);
        System.out.println("Introducir peso:");
        double peso=entrada.nextDouble();
        System.out.println("Introducir altura:");
        double altura=entrada.nextDouble();
        Persona p1=new Persona(nombre, edad, sexo, peso, altura);
        System.out.println("PERSONA 2:");
        System.out.println("Introducir nombre: ");
        nombre=entrada.next();
        System.out.println("Introducir edad:");
        edad=entrada.nextInt();
        System.out.println("Introducir sexo:");
        sexo=entrada.next().charAt(0);
        System.out.println("Introducir peso:");
        peso=entrada.nextDouble();
        System.out.println("Introducir altura:");
        altura=entrada.nextDouble();
        Persona p2=new Persona(nombre, edad, sexo);
        p2.setPeso(peso);
        p2.setAltura(altura);
        System.out.println("PERSONA 3:");
        System.out.println("Introducir nombre: ");
        nombre=entrada.next();
        System.out.println("Introducir edad:");
        edad=entrada.nextInt();
        System.out.println("Introducir sexo:");
        sexo=entrada.next().charAt(0);
        System.out.println("Introducir peso:");
        peso=entrada.nextDouble();
        System.out.println("Introducir altura:");
        altura=entrada.nextDouble();
        Persona p3=new Persona();
        p3.setNombre(nombre);
        p3.setEdad(edad);
        p3.setSexo(sexo);
        p3.setPeso(peso);
        p3.setAltura(altura);
        switch(p1.calcularMC()){
            case -1:
                System.out.println(p1.getNombre()+" está en su peso ideal");
                break;
            case 0:
                System.out.println(p1.getNombre()+" está en por debajo de su peso ideal");
                break;
            case 1:
                System.out.println(p1.getNombre()+" posee sobrepeso");
                break;
        }
        switch(p2.calcularMC()){
            case -1:
                System.out.println(p2.getNombre()+" está en su peso ideal");
                break;
            case 0:
                System.out.println(p2.getNombre()+" está en por debajo de su peso ideal");
                break;
            case 1:
                System.out.println(p2.getNombre()+" posee sobrepeso");
                break;
        }
        switch(p3.calcularMC()){
            case -1:
                System.out.println(p3.getNombre()+" está en su peso ideal");
                break;
            case 0:
                System.out.println(p3.getNombre()+" está en por debajo de su peso ideal");
                break;
            case 1:
                System.out.println(p3.getNombre()+" posee sobrepeso");
                break;
        }
        if(p1.esMayorDeEdad()){
            System.out.println(p1.getNombre()+" es mayor de edad.");
        }else{
            System.out.println(p1.getNombre()+" NO es mayor de edad.");
        }
        if(p2.esMayorDeEdad()){
            System.out.println(p2.getNombre()+" es mayor de edad.");
        }else{
            System.out.println(p2.getNombre()+" NO es mayor de edad.");
        }
        if(p3.esMayorDeEdad()){
            System.out.println(p3.getNombre()+" es mayor de edad.");
        }else{
            System.out.println(p3.getNombre()+" NO es mayor de edad.");
        }
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

}
