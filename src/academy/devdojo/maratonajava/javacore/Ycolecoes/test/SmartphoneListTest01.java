package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("11111", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Samsung");
        Smartphone s3 = new Smartphone("33333", "Pixel");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("33333", "Pixel");
        System.out.println(smartphones.contains(s4));

        int indexSmartphone = smartphones.indexOf(s3);
        System.out.println(indexSmartphone);

        System.out.println(smartphones.get(indexSmartphone));


    }
}
