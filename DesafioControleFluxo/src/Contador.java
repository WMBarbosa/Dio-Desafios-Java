import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        var parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        var parametroDois = terminal.nextInt();

        Contar contar = new Contar();

        try{
            contar.contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}