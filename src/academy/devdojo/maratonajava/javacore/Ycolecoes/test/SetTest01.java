package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(4L, "Naruto", 19.20));
        mangas.add(new Manga(3L, "Attack on Titan", 5.30));
        mangas.add(new Manga(2L, "Dragon ball Z", 11.40));
        mangas.add(new Manga(1L, "Berserk", 1.60));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }



    }
}
