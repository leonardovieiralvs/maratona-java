package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("238DLAO2", "iPhone");
        Smartphone smartphone2 = new Smartphone("238DLAO2", "Samsung");
        System.out.println(smartphone.equals(smartphone2));
    }
}
