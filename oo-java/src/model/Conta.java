package model;

public class Conta {
    private double saldo;

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
    }

    public void zerarSaldo() {
        saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
