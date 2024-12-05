package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);
        Carro carro01 = new Carro("BMW", 280);
        Carro carro02 = new Carro("GOLF", 220);
        Carro carro03 = new Carro("i30", 190);
        carro01.imprime();
        carro02.imprime();
        carro03.imprime();
    }
}
