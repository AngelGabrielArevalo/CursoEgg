package ejercicio4.entidades;

/*@author Angel Gabriel Arévalo*/
public class Perro extends Animal{

    public Perro(String nombre, String tipoDeAlimentacion, int edad, String raza) {
        super(nombre, tipoDeAlimentacion, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("-------------------PERRO--------------------");
        System.out.println(getNombre()+" se alimenta de "+getTipoDeAlimentacion());
        System.out.println("---------------------------------------------");
    }
    
    
    public void ladrar(){
        System.out.println("Gauuuuu");
    }
}
