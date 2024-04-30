public class Contar {

    public  void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroDois <= parametroUm){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem ; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
