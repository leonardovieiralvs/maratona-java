package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Horse", 8.50, Category.DRAMA),
            new LightNovel("Donkey", 1.89, Category.FANTASY),
            new LightNovel("Rabbit", 2, Category.FANTASY),
            new LightNovel("Squirt", 0.5, Category.ROMANCE),
            new LightNovel("Squirt", 0.5, Category.ROMANCE),
            new LightNovel("Dog", 99, Category.DRAMA),
            new LightNovel("Cat", 1.5, Category.DRAMA)));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> groupingList = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(groupingList);
    }
}
