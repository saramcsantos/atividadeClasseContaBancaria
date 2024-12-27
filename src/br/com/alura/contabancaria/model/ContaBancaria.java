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
        saldoDaConta += valorDepositado;
    }

    public void sacaValor(double valorSacado){
        saldoDaConta -= valorSacado;
    }

    public double transfereValor(double valorTransferido) {
        saldoDaConta -= valorTransferido;
        return valorTransferido;
    }

    public double recebeValor(double valorRecebido){
        return saldoDaConta += valorRecebido;
    }
}
