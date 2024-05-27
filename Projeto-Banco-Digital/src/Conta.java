public class Conta implements IConta{

    private Integer agencia;
    private Integer numero;
    private Double saldo;

    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {

    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

}
