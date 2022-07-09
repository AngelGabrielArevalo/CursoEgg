package ejercicio08.entidades;

import java.util.Scanner;

/*@author Angel Gabriel Arévalo*/
public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual, interes;
    
    public Cuenta(){
        
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void actualizarSaldo(){
        saldoActual=saldoActual*(1+(interes/100));
    }
    
    public void ingresar(double saldo){
        
        saldoActual+=saldo;
    }
    
    public void retirar(double saldo){
        if(saldo<=saldoActual){
            saldoActual-=saldo;
        }
        else{
            System.out.println("No posee montos sufucientes!");
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
    
    
}
