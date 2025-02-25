package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class ComparatorTest implements Comparator<Consumidor> {

    @Override
    public int compare(Consumidor o1, Consumidor o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        Consumidor consumidor1 = new Consumidor("Leonardo");
        Consumidor consumidor2 = new Consumidor("Márcio");

        Manga manga1 = new Manga(21L,"Naruto", 11.30, 5);
        Manga manga2 = new Manga(11L,"ParanaGuarulez", 11.55, 2);

        map.put("A", "Letra A");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("D", "Letra D");
        map.put("E", "Letra E");

        System.out.println(map.headMap("A", true));
        System.out.println(map);


    }
}
