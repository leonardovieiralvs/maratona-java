package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Leonardo");
        Consumidor consumidor2 = new Consumidor("Márcio");
        Manga manga1 = new Manga(4L, "Naruto", 19.20, 6);
        Manga manga2 = new Manga(3L, "Attack on Titan", 5.30, 5);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manga1);
        consumidorMangaMap.put(consumidor2, manga2);

        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
            System.out.println(" ");
        }

    }
}
