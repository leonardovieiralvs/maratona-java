package academy.exercicios.poo.ex001.test;

import academy.exercicios.poo.ex001.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Hyundai", "I30", 2010);

        carro.exibirDetalhes();
    }
}
