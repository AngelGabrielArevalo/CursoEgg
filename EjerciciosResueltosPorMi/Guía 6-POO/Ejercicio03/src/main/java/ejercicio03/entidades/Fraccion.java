package ejercicio03.entidades;

/*@author Angel Gabriel Arévalo*/
public class Fraccion {
    private int n1,d1,n2,d2;

    public Fraccion(int n1, int d1, int n2, int d2) {
        this.n1 = n1;
        this.d1 = d1;
        this.n2 = n2;
        this.d2 = d2;
    }
    
    public double sumarFraccion(){
        return ((double)n1/d1)+((double)n2/d2);
    }
    
    public double restarFraccion(){
        return ((double)n1/d1)-((double)n2/d2);
    }
    
    public double dividirFraccion(){
        return ((double)n1/d1)/((double)n2/d2);
    }
    
    public int multiplicarFraccion(){
        return (n1/d1)*(n2/d2);
    }
    
    
    public String sumarFraccionString(){
        int rnum=n1*d2+n2*d1;
        int rden=d1*d2;
        int mcd=1;
        if(rnum>rden){
            for (int i = rden; i >0; i--) {
                if(rnum%i==0 && rden%i==0){
                    mcd=i;
                    break;
                }
            }
        }
        else if(rden>rnum){
            for (int i = rnum; i >0; i--) {
                if(rnum%i==0 && rden%i==0){
                    mcd=i;
                    break;
                }
            }
        }
        return n1+"/"+d1+"+"+n2+"/"+d2+"="+(rnum/mcd)+"/"+(rden/mcd);
    }
    
    public String restarFraccionString(){
        int rnum=n1*d2-n2*d1;
        int rden=d1*d2;
        int mcd=1;
        if(rnum>rden){
            for (int i = rden; i >0; i--) {
                if(rnum%i==0 && rden%i==0){
                    mcd=i;
                    break;
                }
            }
        }
        else if(rden>rnum){
            for (int i = rnum; i >0; i--) {
                if(rnum%i==0 && rden%i==0){
                    mcd=i;
                    break;
                }
            }
        }
        return n1+"/"+d1+"-"+n2+"/"+d2+"="+(rnum/mcd)+"/"+(rden/mcd);
    }
    
    public String multiplicarFraccionString(){
        int rnum=n1*n2;
        int rden=d1*d2;
        int mcd=1;
        if(rnum>rden){
            for (int i = rden; i >0; i--) {
                if(rnum%i==0 && rden%i==0){
                    mcd=i;
                    break;
                }
            }
        }
        else if(rden>rnum){
            for (int i = rnum; i >0; i--) {
                if(rnum%i==0 && rden%i==0){
                    mcd=i;
                    break;
                }
            }
        }
        return n1+"/"+d1+"*"+n2+"/"+d2+"="+(rnum/mcd)+"/"+(rden/mcd);
    }
    
    public String dividirFraccionString(){
        int rnum=n1*d2;
        int rden=n2*d1;
        int mcd=1;
        if(rnum>rden){
            for (int i = rden; i >0; i--) {
                if(rnum%i==0 && rden%i==0){
                    mcd=i;
                    break;
                }
            }
        }
        else if(rden>rnum){
            for (int i = rnum; i >0; i--) {
                if(rnum%i==0 && rden%i==0){
                    mcd=i;
                    break;
                }
            }
        }
        return n1+"/"+d1+" / "+n2+"/"+d2+"="+(rnum/mcd)+"/"+(rden/mcd);
    }
    
}
