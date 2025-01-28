package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        NumberFormat.getNumberInstance();
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        Locale localeCH = Locale.CHINA;
        NumberFormat[] test = new NumberFormat[4];
        test[0] = NumberFormat.getCurrencyInstance(localeJP);
        test[1] = NumberFormat.getCurrencyInstance(localeIT);
        test[2] = NumberFormat.getNumberInstance(localeCH);
        test[3] = NumberFormat.getCurrencyInstance();

        double valor = 100_000_00;

        for (NumberFormat input : test) {
            System.out.println(input.format(valor));
        }
    }
}
