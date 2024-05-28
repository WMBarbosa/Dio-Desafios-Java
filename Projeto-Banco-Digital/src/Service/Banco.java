package Service;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionaConta(Conta conta) {
            this.contas.add(conta);
    }

    public void removeConta(Conta conta) {
        if (contas.isEmpty()){
            System.out.println("A lista está vazia");
        } else {
            this.contas.remove(conta);
        }
    }

    public void totalContas() {
        System.out.println(contas.size());
    }

}