package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calduladora = new Calculadora();
        int b = 6;
        int a = 3;
        calduladora.alteraDoisNumeros(b, a);

        System.out.println("-----------------");

        System.out.println(b);
        System.out.println(a);
    }
}
