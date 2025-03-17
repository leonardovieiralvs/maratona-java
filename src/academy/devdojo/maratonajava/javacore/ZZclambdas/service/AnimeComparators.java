package academy.devdojo.maratonajava.javacore.ZZclambdas.service;

import academy.devdojo.maratonajava.javacore.ZZclambdas.dominio.Anime;

public class AnimeComparators {
    public static int comparatorByEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public static int comparatorByTitle(Anime a1, Anime a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
