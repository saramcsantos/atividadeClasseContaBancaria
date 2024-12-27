package br.com.alura.contabancaria.model;

public class ContaBancaria {
    private int mumeroDaConta;
    protected double saldoDaConta;
    public String nomeDoTitular;

    public int getMumeroDaConta() {
        return mumeroDaConta;
    }

    public void setMumeroDaConta(int mumeroDaConta) {
        this.mumeroDaConta = mumeroDaConta;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public void consultaSaldo(){
        System.out.println("Saldo disponível: R$ " + saldoDaConta);
    }

    public void depositaValor (double valorDepositado){
        System.out.println("Valor do depósito: R$ " +valorDepositado);
        saldoDaConta += valorDepositado;
    }

    public void sacaValor(double valorSacado){
        if (valorSacado <= saldoDaConta){
            System.out.println("Valor do saque: R$ " + valorSacado);
            saldoDaConta -= valorSacado;
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double transfereValor(double valorTransferido) {
        System.out.println("Valor da tranferência: R$ " + valorTransferido);
        saldoDaConta -= valorTransferido;
        return valorTransferido;
    }

    public double recebeValor(double valorRecebido){
        System.out.println("Valor recebido: R$ " +valorRecebido);
        return saldoDaConta += valorRecebido;
    }
}
