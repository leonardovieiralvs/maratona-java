package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest08 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Horse", 8.50),
            new LightNovel("Donkey", 1.89),
            new LightNovel("Rabbit", 2),
            new LightNovel("Squirt", 5.5),
            new LightNovel("Squirt", 3.5),
            new LightNovel("Dog", 99),
            new LightNovel("Dog", 99),
            new LightNovel("Cat", 0)));

    public static void main(String[] args) {
       lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price >= 3)
                .reduce(Double::sum)
               .ifPresent(System.out::println);

        System.out.println("-----");

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println(sum);


    }
}
