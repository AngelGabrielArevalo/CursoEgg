
package palabra.entidades;

import java.util.*;

public class Palabra {
    private ArrayList<String> palabras;

    public Palabra() {
        palabras=new ArrayList<String>();
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void agregarPalabra(String p) {
        palabras.add(p);
    }
    
}
