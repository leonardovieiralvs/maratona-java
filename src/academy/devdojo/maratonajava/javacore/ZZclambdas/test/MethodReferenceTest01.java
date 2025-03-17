package academy.devdojo.maratonajava.javacore.ZZclambdas.test;

import academy.devdojo.maratonajava.javacore.ZZclambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZclambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserker", 200), new Anime("Helsing", 700), new Anime("Naruto", 500)));

        animeList.sort(AnimeComparators::comparatorByEpisodes);
        System.out.println(animeList);
        System.out.println("----");
        animeList.sort(AnimeComparators::comparatorByTitle);
        System.out.println(animeList);

    }
}
