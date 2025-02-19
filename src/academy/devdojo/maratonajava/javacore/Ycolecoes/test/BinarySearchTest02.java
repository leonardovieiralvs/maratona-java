package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.MangaByIdComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(2L, "Naruto", 19.20));
        mangas.add(new Manga(3L, "Attack on Titan", 5.30));
        mangas.add(new Manga(4L, "Dragon ball Z", 11.40));
        mangas.add(new Manga(1L, "Berserk", 1.60));
//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4L, "Dragon ball Z", 11.40);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
