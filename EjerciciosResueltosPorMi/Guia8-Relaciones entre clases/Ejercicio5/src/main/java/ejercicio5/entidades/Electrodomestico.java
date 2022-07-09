package ejercicio5.entidades;

import ejercicio5.enumeraciones.Color;
import ejercicio5.enumeraciones.ConsumoEnergetico;

/*@author Angel Gabriel Arévalo*/
public class Electrodomestico {
    private double precioBase=1000;
    private String color="Blanco";
    private char consumoEnergetico='F';
    private double peso=5;

    public Electrodomestico() {
           
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }
    
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        if(comprobarConsumoEnergetico(consumoEnergetico)){
            this.consumoEnergetico=consumoEnergetico;
        }
        if (comprobarColor(color)) {
            this.color = color;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private static boolean comprobarConsumoEnergetico(char letra){
        for(ConsumoEnergetico aux: ConsumoEnergetico.values()){
            if(aux.toString().charAt(0)==letra){
                return true;
            }
        }
        return false;
    }
    
    private static boolean comprobarColor(String color){
        for(ConsumoEnergetico aux: ConsumoEnergetico.values()){
            if(aux.toString().equals(color)){
                return true;
            }
        }
        return false;
    }
    
    
    public void precioFinal(){
        switch(consumoEnergetico){
            case 'A':
                precioBase+=1000;
                break;
            case 'B':
                precioBase+=800;
                break;
            case 'C':
                precioBase+=600;
                break;    
            case 'D':
                precioBase+=500;
                break;    
            case 'E':
                precioBase+=300;
                break;    
            case 'F':
                precioBase+=100;
                break;    
        }
        if (peso>=0 && peso<=19) {
            precioBase+=100;
        }
        if (peso>=20 && peso<=49) {
            precioBase+=500;
        }
        if (peso>=50 && peso<=79) {
            precioBase+=800;
        }
        if (peso>=80) {
            precioBase+=1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
}
