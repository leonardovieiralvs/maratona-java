package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest03 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Horse", 8.50),
            new LightNovel("Donkey", 1.89),
            new LightNovel("Rabbit", 2),
            new LightNovel("Squirt", 0.5),
            new LightNovel("Dog", 99),
            new LightNovel("Cat", 1.5)));

    public static void main(String[] args) {
        lightNovels.forEach(System.out::println);
//        lightNovels.stream().forEach(System.out::println);
    }
}
