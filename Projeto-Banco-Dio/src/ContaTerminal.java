import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);

// TODO: Leia a entrada do usuário como uma string e todas as informações do Usuário:
        System.out.println("Digite seu nome: ");
        var nomeCliente = leitura.next();
        System.out.println("Digite o numero da conta: ");
        var numeroConta = leitura.nextInt();
        System.out.println("Digite o numero de sua Agência ");
        var agencia = leitura.next();
        System.out.println("Digite seu Saldo: ");
        var saldo = leitura.nextDouble();


// TODO: Recebendo uma nova conta com os parametros digitados pelo usuário:
        ContaBanco conta = new ContaBanco(numeroConta, agencia, nomeCliente, saldo);


// TODO: Impressão de todas as informações do usuario, nome, numero da conta, agência e saldo:
        System.out.println("Olá ".concat(conta.getNomeCliente()) + ", obrigado por criar uma conta em nosso banco, sua agência é "
                .concat(conta.getAgencia()) + ", conta " + conta.getNumero()
                + " e seu saldo".concat(" R$") + conta.getSaldo() + " já está disponivel para saque");
    }
}