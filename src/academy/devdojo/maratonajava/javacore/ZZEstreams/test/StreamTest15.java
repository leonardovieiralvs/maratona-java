package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Horse", 8.50, Category.DRAMA),
            new LightNovel("Donkey", 1.89, Category.FANTASY),
            new LightNovel("Rabbit", 2, Category.FANTASY),
            new LightNovel("Doberman", 5.5, Category.ROMANCE),
            new LightNovel("Squirt", 0.5, Category.ROMANCE),
            new LightNovel("Dog", 99, Category.DRAMA),
            new LightNovel("Cat", 1.5, Category.DRAMA)));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.print(collect);

        System.out.println("----------------");

        Map<Category, DoubleSummaryStatistics> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect1);

        Map<Category, List<Promotion>> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE, Collectors.toList())));
        System.out.println(collect2);

        lightNovels.stream().
                collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTest15::getPromotion,
                                Collectors.toList())));


    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
