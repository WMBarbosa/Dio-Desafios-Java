public class Contar {

    private int parametroUm;
    private int parametroDois;

    public int getParametroUm() {
        return parametroUm;
    }

    public void setParametroUm(int parametroUm) {
        this.parametroUm = parametroUm;
    }

    public int getParametroDois() {
        return parametroDois;
    }

    public void setParametroDois(int parametroDois) {
        this.parametroDois = parametroDois;
    }

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
