package ejercicio16.entidades;

/*@author Angel Gabriel Arévalo*/
public class Matematica {
    private double n1, n2;
    
    public Matematica(){
        n1=0;
        n2=0;
    }
    
    public static double devolverMayor(double n1, double n2){
        if(n1>=n2){
            return n1;
        }else{
            return n2;
        }
    }
    
    public static double calcularPotencia(double n1, double n2){
       if(n1>=n2){
            n1=Math.round(n1);
            n2=Math.round(n2);
            return Math.pow(n1, n2);
        }else{
            return Math.pow(n2, n1);
        }
    }
    
    public static double calcularRaiz(double n1, double n2){
        if(n1<=n2){
            n1=Math.abs(n1);
            return Math.pow(n1, 0.5);
        }else{
            n2=Math.abs(n2);
            return Math.pow(n2, 0.5);
        }
    }
    
    public static double sumaAngulos(double n1, double n2){
        return (Math.sin(n1)*Math.cos(n2)+Math.sin(n2)*Math.cos(n1));
    }
}
