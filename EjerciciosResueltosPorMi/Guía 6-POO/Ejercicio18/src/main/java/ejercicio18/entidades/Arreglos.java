package ejercicio18.entidades;

/*@author Angel Gabriel Arévalo*/
public class Arreglos {
    private double[] arreglo1=new double[50];
    private double[] arreglo2=new double[20];
    
    
    public void llenarArreglo(){
        for(int i=0; i<50; i++){
            arreglo1[i]=(double)((int)(Math.random()*100));
        }
    }
    
    public void ordenarArreglo(){
        double aux;
        for(int i=0; i<49; i++){
            for(int j=0; j<49; j++){
                if(arreglo1[j]>arreglo1[j+1]){
                    aux=arreglo1[j];
                    arreglo1[j]=arreglo1[j+1];
                    arreglo1[j+1]=aux;
                }
            }
        }
    }
    
    public void copiaryLlenarArreglo(){
        for(int i=0;i<20;i++){
            if(i<10){
                arreglo2[i]=arreglo1[i];
            }else{
                arreglo2[i]=0.5;
            }           
        }      
    }
    
    public void mostrarArreglo(double[] arreglo, int longitud){
        for(int i=0; i<longitud; i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
    }
    
    public double[] getArreglo1() {
        return arreglo1;
    }

    public double[] getArreglo2() {
        return arreglo2;
    }

    @Override
    public String toString() {
        return "Arreglos{" + "arreglo1=" + arreglo1 + ", arreglo2=" + arreglo2 + '}';
    }
    
    
    
}
