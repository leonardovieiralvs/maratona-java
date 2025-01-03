package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.CadeiraGamer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto computador = new Computador("Intel Core I5", 3200);
        Tomate tomate = new Tomate("Tomate Limão", 20);
        CadeiraGamer cadeiraGamer = new CadeiraGamer("Cadeira Gamer Naruto", 1900);
        cadeiraGamer.setApoioCabeca("500$");
        tomate.setDataValidade("12/11/2023");
        tomate.setPrecoPorKilo("55$");

        CalculadoraImposto.calcularImpostoProduto(cadeiraGamer);
        CalculadoraImposto.calcularImpostoProduto(computador);
        CalculadoraImposto.calcularImpostoProduto(tomate);

    }
}
