package ejercicio5.entidades;

/*@author Angel Gabriel Arévalo*/
public class Lavadora extends Electrodomestico{
    private double carga=5;

    public Lavadora(){
        super();
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga=carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if(carga>30){
            setPrecioBase(getPrecioBase()+500);
        }
    }
    
    public void hola(){
        System.out.println("hola");
    }

    
    
    
}
