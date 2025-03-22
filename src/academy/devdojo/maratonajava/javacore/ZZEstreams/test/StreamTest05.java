package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> davidList = List.of("David", "Goggins", "Motherfuck");

        List<String> stringList = davidList.stream()
                .map(d -> d.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
