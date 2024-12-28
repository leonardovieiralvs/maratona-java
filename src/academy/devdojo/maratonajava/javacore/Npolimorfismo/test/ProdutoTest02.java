package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Intel Core I5", 3200);
        Produto produto2 = new Tomate("Tomate Limão", 20);

        CalculadoraImposto.calcularImpostoProduto(produto1);
        System.out.println("----------");
        CalculadoraImposto.calcularImpostoProduto(produto2);
    }
}
