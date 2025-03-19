package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int comparatorByEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public static int comparatorByTitle(Anime a1, Anime a2) {
        return a1.getName().compareTo(a2.getName());
    }

    public int comparatorByTitleNonStatic(Anime a1, Anime a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
