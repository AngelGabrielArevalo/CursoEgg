package ejercicio15.entidades;

/*@author Angel Gabriel Arévalo*/
public class Cadena {
    private String frase;
    private int longitudCadena;

    public Cadena(String frase) {
        this.frase = frase;
        longitudCadena=frase.length();
    }
    
    public int mostrarVocales(){
        int cant =0;
        for(int i=0;i<longitudCadena;i++){
            String x=frase.substring(i, i+1);
            if(x.equalsIgnoreCase("a") || x.equalsIgnoreCase("e") || x.equalsIgnoreCase("i") || x.equalsIgnoreCase("o") || x.equalsIgnoreCase("u")){
                cant++;
            }
        }
        return cant;
    }
    
    public void invertirFrase(){
        for(int i=frase.length()-1; i>=0; i--){
            System.out.print(frase.subSequence(i, i+1));
        }
        System.out.println("");
    }
    
    public int vecesRepetido(String carac){
        int cant=0;
        String x;
        for(int i=0; i<frase.length(); i++){
            x=frase.substring(i,i+1);
            if(x.equals(carac)){
                cant++;
            }
        }
        return cant;
    }
    
    public void compararLongitud(String frase){
        if(this.frase.length()==frase.length()){
            System.out.println("Las frases tienen la misma longitud: "+frase.length());
        }else{
            System.out.println("Las frases tienen distinta longitud.");
        }
    }
    
    public void unirFrases(String frase){
        this.frase+=frase;
        System.out.println(this.frase);
    }
    
    public void reemplazar(String carac){
        String x;
        String frase2="";
        for(int i=0; i<frase.length(); i++){
            x=frase.substring(i,i+1);
            if(x.equals("a")){
             frase2+=carac;   
            }else{
                frase+=x;
            }
        }
        frase=frase2;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitudCadena() {
        return longitudCadena;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitudCadena=" + longitudCadena + '}';
    }
    
    
}
