package extraA.entidades;

/*@author Angel Gabriel Arévalo*/
public class Alumno {
    private String nombre;
    private String apellido;
    private long dni;
    private int cantVotos;

    public Alumno(String nombre, String apellido, long dni, int cantVotos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", cantVotos=" + cantVotos + '}';
    }
    
    
    
}
