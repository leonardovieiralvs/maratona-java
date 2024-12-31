package academy.exercicios.poo.ex006.test;

import academy.exercicios.poo.ex006.dominio.Carro;
import academy.exercicios.poo.ex006.dominio.Moto;

public class Test01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.ligar();
        carro.desligar();
        System.out.println("-----");
        moto.ligar();
        moto.desligar();
    }
}
