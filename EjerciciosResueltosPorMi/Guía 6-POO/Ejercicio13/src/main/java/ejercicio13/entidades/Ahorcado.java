package ejercicio13.entidades;

import java.util.Arrays;

/*@author Angel Gabriel Arévalo*/
public class Ahorcado {

    private char vecPalabra[];
    private char vecEncontradas[];
    private int cantidadIntentos;
    private String palabraaBusbar;
    private int cantidadEncontradas=0;
    
    public Ahorcado(String palabraaBuscar, int cantidadIntentos){
        palabraaBusbar=palabraaBuscar;
        vecPalabra=new char[palabraaBuscar.length()];
        vecEncontradas=new char[palabraaBuscar.length()];
        Arrays.fill(vecEncontradas, '_');
        for(int i=0; i<palabraaBuscar.length();i++){
            vecPalabra[i]=palabraaBuscar.charAt(i);
        }
        this.cantidadIntentos=cantidadIntentos;
    }

    public void mostrarLongitud(){
        System.out.println("La longitud de la palabra a buscar es: "+palabraaBusbar.length());
    }
    
    public boolean buscarLetra(char letra){
        boolean laencontro=false;
        for(int i=0;i<palabraaBusbar.length();i++){
            if(vecPalabra[i]==letra){
                cantidadEncontradas++;
                vecEncontradas[i]=letra;
                laencontro=true;
            }
        }
        if(laencontro){
            return true;
        }else{
            cantidadIntentos--;
            return false;
        }
    }
    
    public void informe(char letra){
        if(buscarLetra(letra)){
            System.out.println("La letra pertenece a la palabra.");
        }else{
            System.out.println("La letra no pertenece a la palabra.");
        }
    }
    
    public void encontradas(){
        System.out.println("Letras encontradas: "+cantidadEncontradas+". Letras faltantes: "+(palabraaBusbar.length()-cantidadEncontradas));
    }
    
    public boolean palabraCompleta(){
        if(palabraaBusbar.length()==cantidadEncontradas){
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarEncontradas(){
        for(int i=0;i<palabraaBusbar.length();i++){
            System.out.print(vecEncontradas[i]+" ");
        }
        System.out.println("");
    }
    
    
    //SET Y GET
    public char[] getVecPalabra() {
        return vecPalabra;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public String getPalabraaBusbar() {
        return palabraaBusbar;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }

    public void setPalabraaBusbar(String palabraaBusbar) {
        this.palabraaBusbar = palabraaBusbar;
    }

    public char[] getVecEncontradas() {
        return vecEncontradas;
    }
  
    
}
