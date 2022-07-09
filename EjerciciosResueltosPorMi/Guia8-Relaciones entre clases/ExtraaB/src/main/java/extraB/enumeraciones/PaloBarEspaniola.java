/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package extraB.enumeraciones;

/**
 *
 * @author Angel Gabriel Arévalo
 */
public enum PaloBarEspaniola {
    OROS("Oro"), COPAS("Copa"), ESPADAS("Espada"), BASTOS("Basto");
    
    private String valor;

    private PaloBarEspaniola(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
    
}
