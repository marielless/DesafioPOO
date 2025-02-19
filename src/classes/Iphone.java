package classes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical meuReprodutor = new MeuReprodutorMusical();
        meuReprodutor.tocar();
        meuReprodutor.pausar();
        meuReprodutor.selecionarMusica("Minha Música Favorita");

        AparelhoTelefonico meuTelefone = new MeuAparelhoTelefonico();
        meuTelefone.ligar("123456789");
        meuTelefone.atender();
        meuTelefone.iniciarCorreioVoz();

        NavegadorInternet meuNavegador = new MeuNavegadorInternet();
        meuNavegador.exibirPagina("https://www.example.com");
        meuNavegador.adicionarNovaAba();
        meuNavegador.atualizarPagina();
    }
}
