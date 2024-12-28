package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Intel Core I5", 3200);
        Tomate tomate = new Tomate("Tomate Limão", 20);
        tomate.setDataValidade("12/11/2023");

        CalculadoraImposto.calcularImpostoProduto(produto1);
        System.out.println("------------");
        CalculadoraImposto.calcularImpostoProduto(tomate);

    }
}
