package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Comparator;

public class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId()); // comparando por id
//        return Double.compare(manga1.getPreco(), manga2.getPreco()); Comprando com preço
//        return manga1.getNome().compareTo(manga2.getNome()); Comparando com nome
    }
}
