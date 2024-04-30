import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        var parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        var parametroDois = terminal.nextInt();

        try{
            Contar contar = new Contar();
            contar.contar(parametroUm, parametroDois);


        }catch (ParametrosInvalidosException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}