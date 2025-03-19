package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.MangaPrecidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MangaRepository {
    public static void main(String[] args) {
        List<Manga> mangas = List.of(new Manga(1, "Naruto", 22), new Manga(2, "DragonBall Z", 50));

        List<Manga> filterName = filter(mangas, mangas1 -> mangas1.getName().equalsIgnoreCase("naruato"));
        System.out.println(filterName);
    }

    private static List<Manga> filter(List<Manga> mangas, MangaPrecidate mangaPrecidate) {
        return mangas.stream().filter(mangaPrecidate::test).collect(Collectors.toList());
    }
}
