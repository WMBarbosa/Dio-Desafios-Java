package Principal;

import Service.Cliente;
import Service.Conta;
import Service.ContaCorrente;
import Service.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente wesley = new Cliente();
        wesley.setNome("Wesley");

        Conta contaCorrente = new ContaCorrente(wesley);
        contaCorrente.depositar(100.0);

        Conta contaPoupanca = new ContaPoupanca(wesley);
        contaCorrente.transferir(100.0, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
