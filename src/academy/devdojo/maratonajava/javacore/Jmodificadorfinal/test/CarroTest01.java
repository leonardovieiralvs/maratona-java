package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador("");
        System.out.println();
        carro.setNome("I30");
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Aquiles");
        System.out.println(carro.COMPRADOR);
        System.out.println(carro);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Kisame");
        ferrari.setModelo("Hyundai");
        ferrari.imprime();
    }
}
