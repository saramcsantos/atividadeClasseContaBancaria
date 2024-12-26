import br.com.alura.contabancaria.model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.nomeDoTitular = "Paulo Silveira";
        conta.setMumeroDaConta(1234);
        conta.setSaldoDaConta(1000);

        System.out.println(String.format("Conta: %d | Titular: %s | Saldo atual: % .2f",
                conta.getMumeroDaConta(), conta.nomeDoTitular, conta.getSaldoDaConta()));

        conta.recebeValor(150);

        System.out.println(String.format("Conta: %d | Titular: %s | Saldo atual: % .2f",
                conta.getMumeroDaConta(), conta.nomeDoTitular, conta.getSaldoDaConta()));

        conta.transfereValor(200);

        System.out.println(String.format("Conta: %d | Titular: %s | Saldo atual: % .2f",
                conta.getMumeroDaConta(), conta.nomeDoTitular, conta.getSaldoDaConta()));
    }
}
