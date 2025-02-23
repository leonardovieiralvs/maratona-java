package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Leonardo");
        Consumidor consumidor2 = new Consumidor("Márcio");
        Manga manga1 = new Manga(4L, "Naruto", 19.20, 6);
        Manga manga2 = new Manga(3L, "Attack on Titan", 5.30, 5);
        Manga manga3 = new Manga(7L, "Berserk", 7.70, 0);
        Manga manga4 = new Manga(11L, "Dragonball Z", 3.30, 4);
        Manga manga5 = new Manga(22L, "One Punch Man", 15.30, 2);

        List<Manga> listMangas1 = List.of(manga1, manga2, manga3);
        List<Manga> listMangas2 = List.of(manga4, manga5);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, listMangas1);
        consumidorMangaMap.put(consumidor2, listMangas2);

        for (Map.Entry<Consumidor, List<Manga>> consumidorListEntry : consumidorMangaMap.entrySet()) {
            System.out.println("**"+consumidorListEntry.getKey().getNome());

            for (Manga manga : consumidorListEntry.getValue()) {
                System.out.println("----- "+manga.getNome());
            }
            System.out.println(" ");
        }
    }
}
