package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> cabosBlog = new ArrayList<>();
        List<String> cabosCcap = List.of("Jurandir (CCAp)", "Jurandir (CCAp)", "Jurandir (CCAp)");
        List<String> cabosCiasup = List.of("Ramirez (Suprimento)", "Ramirez (Suprimento)", "Ramirez (Suprimento)");
        List<String> cabosCiamnt = List.of("Ronaldo (Manutenção)", "Ronaldo (Manutenção)", "Ronaldo (Manutenção)");
        cabosBlog.add(cabosCcap);
        cabosBlog.add(cabosCiasup);
        cabosBlog.add(cabosCiamnt);

//        for (List<String> cabosList : cabosBlog) {
//            for (String soldiers : cabosList) {
//                System.out.println(soldiers);
//            }
//        }

        cabosBlog.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
