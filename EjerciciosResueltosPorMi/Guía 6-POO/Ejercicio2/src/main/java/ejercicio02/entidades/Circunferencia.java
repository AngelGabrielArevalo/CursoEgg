package ejercicio02.entidades;

/*@author Angel Gabriel Arévalo*/
public class Circunferencia {
    private double radio;
    
    public Circunferencia(double radio){
        this.radio=radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio=radio;
    }
    
    public double areaCircunferencia(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    public double perimetroCircunferencia(){
        return 2*Math.PI*radio;
    }
}
