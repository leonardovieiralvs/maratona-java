package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("diamond", "diamante");
        map.put("teklado", "teclado");
        map.put("vc", "você");
        map.put("vce", "você");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key+" : "+map.get(key));
        }

        System.out.println("-----------");

        for (String values : map.values()) {
            System.out.println(values);
        }

        System.out.println("-----------");

        for (Map.Entry<String, String> keysandvalues : map.entrySet()) {
            System.out.println(keysandvalues);
        }


    }
}
