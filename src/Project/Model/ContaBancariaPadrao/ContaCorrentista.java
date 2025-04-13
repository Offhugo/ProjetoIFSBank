package Project.Model.ContaBancariaPadrao;

import java.time.LocalDate;

public class ContaCorrentista extends Conta {
    final private double taxaMovimentação = 0.95;

    public ContaCorrentista(int numero, double saldo, LocalDate dataAbertura, LocalDate dataEncerramento) {
        super(numero, saldo, dataAbertura, dataEncerramento);
    }

    // Métodos SobreEscritos

    @Override
    public void debito(double saldo) {
        double novoSaldo = getSaldo() - saldo;
        double valorTaxado = novoSaldo - (novoSaldo * taxaMovimentação);

        setSaldo(novoSaldo * taxaMovimentação);

        System.out.println("Novo saldo = R$" + novoSaldo);
        System.out.println("Considerando a taxa de 5%, o valor taxado foi de : R$" + valorTaxado);
    }

    @Override
    public void credito(double saldo) {
        double novoSaldo = getSaldo() - saldo;
        double valorTaxado = novoSaldo - (novoSaldo * taxaMovimentação);

        setSaldo(novoSaldo * taxaMovimentação);

        System.out.println("Novo saldo = R$" + novoSaldo);
        System.out.println("Considerando a taxa de 5%, o valor taxado foi de : R$" + valorTaxado);
    }
}
