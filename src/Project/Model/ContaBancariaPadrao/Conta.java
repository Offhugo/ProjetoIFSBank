package Project.Model.ContaBancariaPadrao;

import java.time.LocalDate;

public class Conta {

    private int numero;
    private double saldo;
    private LocalDate dataAbertura;
    private LocalDate dataEncerramento;

    public Conta(int numero, double saldo, LocalDate dataAbertura, LocalDate dataEncerramento){
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = dataEncerramento;
    }

    public String toString() {
        return  "Numero: " + numero +
                " Saldo: " + saldo +
                " dataAbertura: " +
                " dataEncerramento";
    }

    // Métodos específicos

    public void debito(double saldo) {
        double novoSaldo = getSaldo() - saldo;
        setSaldo(novoSaldo);
        System.out.println("Novo saldo = " + novoSaldo);
    }

    public void credito(double saldo) {
        double novoSaldo = getSaldo() + saldo;
        setSaldo(novoSaldo);
        System.out.println("Novo saldo = " + novoSaldo);
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(LocalDate dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
