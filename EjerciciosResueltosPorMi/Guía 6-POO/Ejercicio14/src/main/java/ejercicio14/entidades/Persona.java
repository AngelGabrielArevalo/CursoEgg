
package ejercicio14.entidades;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso, altura;
    
    public Persona(){
       
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso=72;
        altura=1.5;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public int calcularMC(){
        double pesoideal=(double)peso/Math.pow(altura, 2);
        if(pesoideal<20){
            return -1;
        }else if(pesoideal>=20 && pesoideal<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
        if(edad>=18){
            return true;
        }else{
            return false;
        }
    }
    
    public void comprobarSexo(){
        if(sexo!='H' && sexo!='M' && sexo!='O'){
            System.out.println("Tipo de sexo invalido!");
        }
    }
    
    
    
    //GET Y SET
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
}
