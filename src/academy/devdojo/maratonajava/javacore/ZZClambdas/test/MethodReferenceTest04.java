package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {

        Supplier<AnimeComparators> newAnimeComparator = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparator.get();

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserker", 200), new Anime("Aelsing", 700), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::comparatorByTitleNonStatic);
        System.out.println(animeList);
    }
}
