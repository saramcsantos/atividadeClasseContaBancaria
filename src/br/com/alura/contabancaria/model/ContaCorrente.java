package br.com.alura.contabancaria.model;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobraTarifaMensal(ContaBancaria contaBank){
        contaBank.saldoDaConta -= tarifaMensal;
    }
}
