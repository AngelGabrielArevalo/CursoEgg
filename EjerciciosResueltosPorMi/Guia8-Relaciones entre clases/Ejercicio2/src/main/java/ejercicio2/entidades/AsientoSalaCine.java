
package ejercicio2.entidades;

import java.util.ArrayList;

public class AsientoSalaCine {
    private int filaAsiento;
    private char columnaAsiento;
    private boolean ocupado;
    private Espectador espectador;
    private ArrayList<AsientoSalaCine> asientos=new ArrayList<AsientoSalaCine>();
    private String abc="ABCDEFGHIJKLMNOPQRSTUVXYZ";
    private int f;
    private int c;

    public AsientoSalaCine(int filaAsiento, char columnaAsiento) {
        this.filaAsiento = filaAsiento;
        this.columnaAsiento = columnaAsiento;
        ocupado=false;
    }

    public AsientoSalaCine() {
        llenarAsientos(8, 9);
        f=8;
        c=9;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public Espectador getEspectador() {
        return espectador;
    }
    
    
    
    
    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getFilaAsiento() {
        return filaAsiento;
    }

    public void setFilaAsiento(int filaAsiento) {
        this.filaAsiento = filaAsiento;
    }

    public char getColumnaAsiento() {
        return columnaAsiento;
    }

    public void setColumnaAsiento(char columnaAsiento) {
        this.columnaAsiento = columnaAsiento;
    }
    
    public void llenarAsientos(int cantFilas, int cantColumnas){
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantColumnas; j++) {
               asientos.add(new AsientoSalaCine((i+1), abc.charAt(j))); 
            }           
        }
    }

    public ArrayList<AsientoSalaCine> getAsientos() {
        return asientos;
    }
    

    @Override
    public String toString() {
        return "SalaCine{" + "Fila=" + filaAsiento + ", Columna=" + columnaAsiento + ", ocupado=" + ocupado + '}';
    }

    public int getF() {
        return f;
    }

    public int getC() {
        return c;
    }
    
    public void mostrarAsientos(){
        int aux=c;
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j <c; j++) {
                System.out.print(""+asientos.get(f*c-aux+j).getFilaAsiento()+""+ asientos.get(f*c-aux+j).getColumnaAsiento()+" ");
            }
            System.out.println("");
            aux+=c;
        }
    }
    
    
   
}
