package Aparelho;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void ligar() {
        System.out.println("Iphone está ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo paginas web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova pagina");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Atualizando pagina web");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a musica desejada");
    }
}
