package Project.Model.ContaBancariaPadrao;

import java.time.LocalDate;

public class ContaPoupança extends Conta {
    private double taxaVariacao = 0.98;

    public ContaPoupança(int numero, double saldo, LocalDate dataAbertura, LocalDate dataEncerramento, double taxaVariacao) {
        super(numero, saldo, dataAbertura, dataEncerramento);
        this.taxaVariacao = taxaVariacao;
    }

    @Override
    public void debito(double saldo) {
        double novoSaldo = getSaldo() - saldo;
        double valorTaxado = novoSaldo - (novoSaldo * taxaVariacao);

        setSaldo(novoSaldo * taxaVariacao);

        System.out.println("Novo saldo = R$" + novoSaldo);
        System.out.println("Considerando a taxa de 5%, o valor taxado por variação foi de : R$" + valorTaxado);
    }

    @Override
    public void credito(double saldo) {
        double novoSaldo = getSaldo() - saldo;
        double valorTaxado = novoSaldo - (novoSaldo * taxaVariacao);

        setSaldo(novoSaldo * taxaVariacao);

        System.out.println("Novo saldo = R$" + novoSaldo);
        System.out.println("Considerando a taxa de 2%, o valor taxado por variação foi de : R$" + valorTaxado);
    }

}
