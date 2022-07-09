package ejercicio07.entidades;

/*@author Angel Gabriel Arévalo*/
public class Rectangulo {
    private int alto, largo;

    public Rectangulo(int alto, int largo) {
        this.alto = alto;
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "alto=" + alto + ", largo=" + largo + '}';
    }
    
    public int superficieRectangulo(){
        return largo*alto;
    }
    
    public int perimetroRectangulo(){
        return 2*largo+2*alto;
    }
    
    public void desplazarRectangulo(int alto, int largo){
        this.alto+=alto;
        this.largo+=largo;
    } 
    
    public void dibujarRectangulo(){
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < largo; j++) {
                if(i==0 || i==alto-1){
                    System.out.print("*");
                }
                else if(j==0 || j==largo-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
