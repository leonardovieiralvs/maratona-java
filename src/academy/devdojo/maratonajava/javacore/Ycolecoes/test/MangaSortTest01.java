package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.MangaByIdComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Naruto", 19.20));
        mangas.add(new Manga(3L, "Attack on Titan", 5.30));
        mangas.add(new Manga(2L, "Dragon ball Z", 11.40));
        mangas.add(new Manga(1L, "Berserk", 1.60));
        System.out.println("Aleatoriamente: ");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("Ordenado por Nomes: ");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("Ordenado por Id's");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
