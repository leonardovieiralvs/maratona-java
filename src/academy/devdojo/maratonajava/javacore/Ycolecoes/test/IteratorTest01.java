package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Naruto", 19.20, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 5.30, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 11.40, 0));
        mangas.add(new Manga(1L, "Berserk", 1.60, 2));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
