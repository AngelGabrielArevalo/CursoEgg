package extraB;

 /*@author Angel Gabriel Arévalo*/ 

import extraB.entidades.Baraja;
import extraB.entidades.BarajaEspaniola;
import extraB.entidades.BarajaFrancesa;
import extraB.entidades.Carta;
import extraB.enumeraciones.PaloBarEspaniola;
import extraB.enumeraciones.PaloBarFrancesa;
import java.util.Scanner;

public class JuegoBarajaCartas {
    public static void main(String[] args) {
      Baraja barajaEsp=new BarajaEspaniola(true);
      barajaEsp.crearBaraja();
      Baraja barajaFran=new BarajaFrancesa();
      barajaFran.crearBaraja();
      barajaFran.mostrarBaraja();
    }

}
