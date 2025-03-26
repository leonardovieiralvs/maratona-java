package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Leo", "Rei", "de", "Thais")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        int[] num = {1, 2, 3, 4, 5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        try (Stream<String> lines = Files.lines(Paths.get("pasta/file.txt"))) {
            lines.filter(l -> l.contains("java")).
                    forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
