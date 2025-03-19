package academy.devdojo.maratonajava.javacore.ZZEstreams.compares;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

public class LightNovelCompare {

    public static int compareByTittle(LightNovel a1, LightNovel a2) {
        return a1.getTittle().compareTo(a2.getTittle());
    }

    public static int compareByPrice(LightNovel a1, LightNovel a2) {
        return Double.compare(a1.getPrice(), a2.getPrice());
    }
}
