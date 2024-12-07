package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador[] jogadores = {jogador, jogador2};
        Time time = new Time("Brasil");

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("------- JOGADORES ------");
        jogador.imprime();
        System.out.println(jogador2.getNome());
        System.out.println("------- TIME ------");
        time.imprime();

    }
}
