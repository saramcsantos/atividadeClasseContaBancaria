package br.com.alura.contabancaria.model;

public class ContaBancaria {
    private int mumeroDaConta;
    private double saldoDaConta;
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

    public double recebeValor(double valorRecebido){
        // System.out.println("Saldo disponível: " + saldoDaConta);
        return saldoDaConta += valorRecebido;
    }

    public double transfereValor(double valorTransferido){
        if(valorTransferido <= saldoDaConta){
            // System.out.println("Saldo disponível: R$ " + saldoDaConta);
            return saldoDaConta -= valorTransferido;
        }else{
            // System.out.println("Saldo insuficiente!");
            return 0;
        }
    }
}
