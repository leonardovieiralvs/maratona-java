package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Horse", 8.50, Category.DRAMA),
            new LightNovel("Donkey", 1.89, Category.FANTASY),
            new LightNovel("Rabbit", 2, Category.FANTASY),
            new LightNovel("Squirt", 0.5, Category.ROMANCE),
            new LightNovel("Dog", 99, Category.DRAMA),
            new LightNovel("Cat", 1.5, Category.DRAMA)));

    public static void main(String[] args) {
//        Map<Promotion, List<LightNovel>> groupList = lightNovels.stream()
//                .collect(Collectors.groupingBy(ln -> ln.getPrice() > 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));

        Map<Category, Map<Promotion, List<LightNovel>>> collectPromotionCategory = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(ln -> ln.getPrice() > 6 ?
                        Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));

        System.out.println(collectPromotionCategory);

    }
}
