package Service;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Service.Conta de Poupanca ===");
        super.imprimirInformacoesComuns();
    }
}
