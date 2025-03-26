package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(s -> System.out.print(s + " "));

        System.out.println("-----");

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1,500))
                .limit(90)
                .forEach(System.out::println);
    }
}
