import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        var nomeCliente = leitura.next();
        System.out.println("Digite o numero da conta: ");
        var numeroConta = leitura.nextInt();
        System.out.println("Digite o numero de sua Agência ");
        var agencia = leitura.next();
        System.out.println("Digite seu Saldo: ");
        var saldo = leitura.nextDouble();

        ContaBanco conta = new ContaBanco(numeroConta, agencia, nomeCliente, saldo);

        System.out.println("Olá ".concat(conta.getNomeCliente()) + ", obrigado por criar uma conta em nosso banco, sua agência é "
                .concat(conta.getAgencia()) + ", conta " + conta.getNumero()
                + " e seu saldo".concat(" R$") + conta.getSaldo() + " já está disponivel para saque");
    }
}