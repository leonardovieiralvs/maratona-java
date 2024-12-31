package academy.exercicios.poo.ex007.test;

import academy.exercicios.poo.ex007.dominio.Produto;

public class Test01 {
    public static void main(String[] args) {
        Produto produto = new Produto("Copo Stanley", 70, 6);
        produto.calcularTotal();
    }
}
