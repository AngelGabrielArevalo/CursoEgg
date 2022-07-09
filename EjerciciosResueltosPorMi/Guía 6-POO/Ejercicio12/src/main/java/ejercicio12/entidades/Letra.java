package ejercicio12.entidades;

/*@author Angel Gabriel Arévalo*/
public class Letra {
    private long dni;
    private char letra;
    
    public Letra(){
        dni=0;
        letra=' ';
    }
    
    public Letra(long dni){
        this.dni=dni;
        letra=validarDigito(dni);
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
        letra=validarDigito(dni);
    }

    public char getLetra() {
        return letra;
    }
    
    public void leer(long dni){
        this.dni=dni;
        letra=validarDigito(dni);
    }
    
    public String mostrarNIF(){
        return dni+"-"+letra;
    }

    @Override
    public String toString() {
        return "Letra{" + "dni=" + dni + ", letra=" + letra + '}';
    }
    
    
    
    public char validarDigito(long dni){
        char vec[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return vec[(int)(dni%23)];
    }
}
