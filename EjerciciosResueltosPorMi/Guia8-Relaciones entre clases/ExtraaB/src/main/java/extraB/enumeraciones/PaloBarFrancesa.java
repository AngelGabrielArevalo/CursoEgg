/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package extraB.enumeraciones;

/**
 *
 * @author Angel Gabriel Arévalo
 */
public enum PaloBarFrancesa {
    DIAMANTES("Diamantes"), PICAS("Picas"), CORAZONES("Corazones"), TREBOLES("Treboles");
    
    private String valor;

    private PaloBarFrancesa(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
    
}
