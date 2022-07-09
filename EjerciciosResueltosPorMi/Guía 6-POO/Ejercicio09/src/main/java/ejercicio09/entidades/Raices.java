
package ejercicio09.entidades;

public class Raices {
    private double a,b,c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminate(){
        return (Math.pow(b, 2))-4*a*c;
    }
    
    public boolean tieneRaices(Raices r){
        if(r.getDiscriminate()>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean tieneRaiz(Raices r){
        if(r.getDiscriminate()==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void obtenerRaices(Raices r){
        if(r.tieneRaices(r)){
            double r1=(-b+Math.pow(r.getDiscriminate(), 0.5))/(2*a);
            double r2=(-b-Math.pow(r.getDiscriminate(), 0.5))/(2*a);
            System.out.println("r1: "+r1+", r2: "+r2);
        }
    }
    
    public void obtenerRaiz(Raices r){
        if(r.tieneRaiz(r)){
            System.out.println("r: "+(-b/(2*a)));
        }
    }
    
    public void calcular(Raices r){
        if(r.tieneRaices(r)){
            r.obtenerRaices(r);
        }
        else if(r.tieneRaiz(r)){
            r.obtenerRaiz(r);
        }
        else{
            System.out.println("No esxisten raices.");        }
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
}
