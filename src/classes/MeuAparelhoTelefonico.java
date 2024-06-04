package classes;

import interfaces.AparelhoTelefonico;

public class MeuAparelhoTelefonico implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
