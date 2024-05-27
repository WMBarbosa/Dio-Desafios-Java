package Service;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor == 0){
            System.out.println("Digite um valor para depositar, diferente de 0.0");
        }else {
            saldo += valor;
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if(valor <= this.saldo){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }


    protected void imprimirInformacoesComuns() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }
}
