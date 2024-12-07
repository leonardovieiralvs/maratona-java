package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Modric");
        Jogador jogador3 = new Jogador("Halland");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogadore : jogadores) {
            jogadore.imprime();

        }

    }
}
