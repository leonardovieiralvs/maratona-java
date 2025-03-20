package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Horse", 8.50),
            new LightNovel("Donkey", 1.89),
            new LightNovel("Rabbit", 2),
            new LightNovel("Squirt", 0.5),
            new LightNovel("Squirt", 0.5),
            new LightNovel("Dog", 99),
            new LightNovel("Dog", 99),
            new LightNovel("Cat", 1.5)));

    public static void main(String[] args) {
//        lightNovels.forEach(System.out::println);
//        lightNovels.stream().forEach(System.out::println);
        Stream<LightNovel> stream = lightNovels.stream();
        long count1 = stream.filter(lightNovel -> lightNovel.getPrice() <= 4).count();
        long count = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count1);
        System.out.println(count);
    }
}
