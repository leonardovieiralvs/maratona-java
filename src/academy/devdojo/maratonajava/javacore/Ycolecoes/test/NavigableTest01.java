package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SmartphoneComparator;

import java.util.*;

class ComparePreco implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new ComparePreco());
        mangas.add(new Manga(4L, "Naruto", 19.20, 5));
        mangas.add(new Manga(3L, "Attack on Titan", 5.30, 10));
        mangas.add(new Manga(2L, "Dragon ball Z", 11.40, 0));
        mangas.add(new Manga(5L, "One Punch Man", 5.0,2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--------");

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        System.out.println("--------");

        Manga test = new Manga(5L, "Kakashi", 5.0, 2);
        System.out.println(mangas.lower(test)); // <
        System.out.println(mangas.floor(test));
        System.out.println(mangas.higher(test));
        System.out.println(mangas.ceiling(test));

        System.out.println("--------");

        System.out.println(mangas.pollFirst());

    }
}
