package Principal;

import Service.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        Cliente cliente = null;
        Conta conta = null;

        do {
            System.out.println("==== Serviços ====");
            System.out.println("1- Criar uma conta");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Transferir");
            System.out.println("5- Verificar Extrato");
            System.out.println("0- Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Qual conta deseja criar? ");
                    System.out.println("1- Conta Corrente");
                    System.out.println("2- Conta Poupanca");
                    int escolha = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do Cliente: ");
                    String nomeCliente = sc.nextLine();

                    cliente = new Cliente();
                    cliente.setNome(nomeCliente);

                    if (escolha == 1) {
                        conta = new ContaCorrente(cliente);
                    } else if (escolha == 2) {
                        conta = new ContaPoupanca(cliente);
                    }

                    System.out.println("Conta criada com sucesso! Número: " + conta.getNumero());
                    break;

                case 2:
                    if (conta == null) {
                        System.out.println("Nenhuma conta criada.");
                    } else {
                        System.out.println("Digite o valor do depósito: ");
                        double deposito = sc.nextDouble();

                        conta.depositar(deposito);
                        System.out.println("Saldo atual: " + conta.getSaldo());
                    }
                    break;

                case 3:
                    if (conta == null) {
                        System.out.println("Nenhuma conta criada.");
                    } else {
                        System.out.println("Digite o valor para saque: ");
                        double saque = sc.nextDouble();

                        conta.sacar(saque);
                        System.out.println("Saldo atual: " + conta.getSaldo());
                    }
                    break;

                case 4:
                    if (conta == null) {
                        System.out.println("Nenhuma conta criada.");
                    } else {
                        System.out.println("Digite o valor para transferir: ");
                        double valorTransferencia = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Digite o número da conta de destino:");
                        int numeroContaDestino = sc.nextInt();

                        Conta contaDestino = Conta.encontrarConta(numeroContaDestino);

                        if (contaDestino != null) {
                            conta.transferir(valorTransferencia, contaDestino);
                            System.out.println("Transferência realizada com sucesso!");
                        } else {
                            System.out.println("Conta de destino não encontrada.");
                        }
                    }
                    break;

                case 5:
                    if (conta == null) {
                        System.out.println("Nenhuma conta criada.");
                    } else {
                        System.out.println("Extrato da conta:");
                        conta.imprimirExtrato();
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }


    }
}

