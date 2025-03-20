package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Horse", 8.50),
            new LightNovel("Donkey", 1.89),
            new LightNovel("Rabbit", 2),
            new LightNovel("Squirt", 0.5),
            new LightNovel("Dog", 99),
            new LightNovel("Cat", 1.5)));

    public static void main(String[] args) {
        List<String> stringList = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTittle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTittle) // extraindo apenas os titulos
                .collect(Collectors.toList());

        System.out.println(stringList);
    }
}
