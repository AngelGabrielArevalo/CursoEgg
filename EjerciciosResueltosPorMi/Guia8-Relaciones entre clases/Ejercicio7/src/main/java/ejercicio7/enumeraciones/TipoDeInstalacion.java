/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio7.enumeraciones;

/**
 *
 * @author Angel Gabriel Arévalo
 */
public enum TipoDeInstalacion {
    TECLADO(1, "Techado"),ABIERTO(2, "Abierto");
    
    private Integer codigo;
    private String valor;

    private TipoDeInstalacion(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
    
    
    
}
