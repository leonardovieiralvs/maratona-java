package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Comparator;

public class SmartphoneComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
