package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(30);
        List<String> nomes2 = new ArrayList<>(30);
        nomes.add("\nLeo");
        nomes.add("Souza");
        nomes2.add("King");
        nomes2.add("ALL");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("King of Thais");

        for (int i = 0; i < nomes.size() ; i++) {
            System.out.println(nomes.get(i));
        }


        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);


    }
}
