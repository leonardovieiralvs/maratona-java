package academy.devdojo.maratonajava.javacore.Gassociacao.testtest;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Batalhao;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Militares;

public class Brigada {
    public static void main(String[] args) {
        Militares militar1 = new Militares("Cb L. Souza");
        Militares militar2 = new Militares("Cb Lazaro");
        Batalhao batalhao = new Batalhao("\nIntegrantes "+"2ªB Log: ", new Militares[]{militar1, militar2});
        //batalhao.setMilitares(militares);
        batalhao.imprime();
    }
}
