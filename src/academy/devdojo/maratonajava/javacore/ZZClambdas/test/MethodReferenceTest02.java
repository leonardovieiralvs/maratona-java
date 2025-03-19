package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserker", 200), new Anime("Aelsing", 700), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::comparatorByTitleNonStatic);
        System.out.println(animeList);

        System.out.println("-----------");

        List<String> listString = new ArrayList<>(List.of("Itachi", "Obito", "Hiruzen"));
        listString.sort(String::compareTo);
        System.out.println(listString);

    }
}
