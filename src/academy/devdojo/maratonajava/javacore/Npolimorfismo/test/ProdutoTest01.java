package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Intel Core I7", 5000);
        Tomate tomate = new Tomate("Tomate", 3.50);

        CalculadoraImposto.calcularImpostoProduto(computador);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImpostoProduto(tomate);
    }
}
