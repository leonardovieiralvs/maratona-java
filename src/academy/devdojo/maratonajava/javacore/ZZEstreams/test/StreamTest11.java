package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest11 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Horse", 8.50),
            new LightNovel("Donkey", 1.89),
            new LightNovel("Rabbit", 2),
            new LightNovel("Squirt", 0.5),
            new LightNovel("Squirt", 0.5),
            new LightNovel("Dog", 99),
            new LightNovel("Dog", 99.99),
            new LightNovel("Cat", 1.5)));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().min(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println("--");

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String string = lightNovels.stream().map(LightNovel::getTittle).collect(Collectors.joining(", "));
        System.out.println(string);
    }
}
