package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SmartphoneComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(4L, "Naruto", 19.20, 5));
        mangas.add(new Manga(3L, "Attack on Titan", 5.30, 10));
        mangas.add(new Manga(2L, "Dragon ball Z", 11.40, 0));
        mangas.add(new Manga(5L, "One Punch Man", 1.40,2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
