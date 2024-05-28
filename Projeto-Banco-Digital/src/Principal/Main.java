package Principal;

import Service.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Wesley");

        Conta cc = new ContaCorrente(c1);
        Conta poupanca = new ContaPoupanca(c1);

        Banco banco = new Banco();
        banco.adicionaConta(cc);
        banco.adicionaConta(poupanca);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.totalContas();

    }
}

