package ejercicio17.entidades;

/*@author Angel Gabriel Arévalo*/
public class Meses {
    private String meses[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto;
    private String mesIngresado;
    
    
    public void setearMesSecreto(){
        int x;
        x=(int)(Math.random()*12);
        mesSecreto=meses[x];
    }
    
    public boolean adivinaMes(String mesIngresado){
        this.mesIngresado=mesIngresado;
        if(mesIngresado.equals(mesSecreto)){
            return true;
        }else{
            return false;
        }
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public String getMesIngresado() {
        return mesIngresado;
    }

    public void setMesIngresado(String mesIngresado) {
        this.mesIngresado = mesIngresado;
    }
    
    
}
