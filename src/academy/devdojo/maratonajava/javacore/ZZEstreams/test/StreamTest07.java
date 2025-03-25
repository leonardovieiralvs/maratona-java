package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println); // Method Reference -> Lambda
        System.out.println("---------");
        Integer reduce = integers.stream().reduce(2, Integer::sum);
        System.out.println(reduce);

        integers.stream().reduce((x,y) -> x*y).ifPresent(System.out::println);

        integers.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}
