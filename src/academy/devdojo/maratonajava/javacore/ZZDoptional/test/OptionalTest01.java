package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> stringOp = Optional.of("Ra Re Ri Ro RUA");
        Optional<String> stringNull = Optional.ofNullable(null);
        System.out.println(stringOp);
        System.out.println(stringNull);
        System.out.println("-----");

        Optional<String> stringFind = Optional.ofNullable(findName("Leonardo"));
        System.out.println(stringFind);
    }

    private static String findName(String name) {
        List<String> stringList = List.of("Leonardo", "Obito");
        int i = stringList.indexOf(name);
        if (i != 1) {
            return stringList.get(i);
        }
        return null;
    }
}