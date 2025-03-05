package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Moto;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Moto> hornet = criarArrayComUmObjeto(new Moto("Hornet"));
        List<Carro> i30 = criarArrayComUmObjeto(new Carro("I30"));
        List<Barco> iate = criarArrayComUmObjeto(new Barco("Iate"));
        System.out.println(hornet);
        System.out.println(i30);
        System.out.println(iate);

        System.out.println("------");

        criarArrayComUmObjeto1(new Moto("Hornet"));
        criarArrayComUmObjeto1(new Carro("I30"));
        criarArrayComUmObjeto1(new Barco("Iate"));
    }

    public static <T> List<T> criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        return list;
    }

    public static <T> void criarArrayComUmObjeto1(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}


