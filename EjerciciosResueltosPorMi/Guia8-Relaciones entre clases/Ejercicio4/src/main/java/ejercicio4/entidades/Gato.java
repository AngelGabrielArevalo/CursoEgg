package ejercicio4.entidades;

/*@author Angel Gabriel Arévalo*/
public class Gato extends Animal{

    public Gato(String nombre, String tipoDeAlimentacion, int edad, String raza) {
        super(nombre, tipoDeAlimentacion, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("-------------------GATO--------------------");
        System.out.println(getNombre()+" se alimenta de "+getTipoDeAlimentacion());
        System.out.println("---------------------------------------------");
    }

    
}
