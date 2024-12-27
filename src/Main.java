import br.com.alura.contabancaria.model.ContaBancaria;
import br.com.alura.contabancaria.model.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.nomeDoTitular = "Paulo Silveira";
        conta.setMumeroDaConta(1234);
        conta.setSaldoDaConta(1000);

        System.out.println(String.format("Conta: %d | Titular: %s | Saldo atual: % .2f",
                conta.getMumeroDaConta(), conta.nomeDoTitular, conta.getSaldoDaConta()));

        System.out.println("---------------------------------");
        conta.depositaValor(200);
        conta.consultaSaldo(); // 1200

        System.out.println("---------------------------------");
        double valorSaque = 40;
        if (conta.getSaldoDaConta() >= valorSaque){
            conta.sacaValor(valorSaque);
        }else{
            System.out.println("Saldo Insuficiente!");
        }
        conta.consultaSaldo(); // 1160

        System.out.println("---------------------------------");
        double valorTransferencia = 40;
        if (conta.getSaldoDaConta() >= valorTransferencia){
            conta.transfereValor(valorTransferencia);
        }else{
            System.out.println("Saldo Insuficiente!");
        }
        conta.consultaSaldo(); // 1120

        System.out.println("---------------------------------");
        conta.recebeValor(valorTransferencia);
        conta.consultaSaldo(); //1160

        System.out.println("---------------------------------");
        ContaCorrente contacorrente = new ContaCorrente();
        contacorrente.setTarifaMensal(100);
        contacorrente.cobraTarifaMensal(conta);
        System.out.println("Tarifa Mensal: R$ " + contacorrente.getTarifaMensal() + " Saldo disponível: R$ " + conta.getSaldoDaConta());
    }
}
