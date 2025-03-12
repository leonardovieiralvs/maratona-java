package academy.devdojo.maratonajava.javacore.ZZclambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class lambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Obito", "Zetsu", "Itachi");
        List<Integer> integers = List.of(1,2,3,4,5);
        forEach(strings, e -> System.out.println(e));
        forEach(integers, e -> System.out.println(e));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
