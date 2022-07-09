package ejercicio5.entidades;

/*@author Angel Gabriel Arévalo*/
public class Televisor extends Electrodomestico {
    private int resolucion=20;
    private boolean sintonizadorTDT=false;

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Televisor() {
        super();
    }

    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if(resolucion>40){
            setPrecioBase(getPrecioBase()*1.3);
        }
        if(sintonizadorTDT){
            setPrecioBase(getPrecioBase()+500);
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }

    
      
}
