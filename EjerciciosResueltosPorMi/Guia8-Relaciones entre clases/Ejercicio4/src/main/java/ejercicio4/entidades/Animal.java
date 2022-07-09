package ejercicio4.entidades;

/*@author Angel Gabriel Arévalo*/
public abstract class Animal {
    private String nombre, tipoDeAlimentacion, raza;
    private int edad;

    public Animal(String nombre, String tipoDeAlimentacion, int edad, String raza) {
        this.nombre = nombre;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
        this.raza = raza;
        this.edad = edad;
    }
    
    public abstract void alimentarse();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
