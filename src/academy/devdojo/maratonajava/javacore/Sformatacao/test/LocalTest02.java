package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
         System.out.println(Locale.getDefault());

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoCountry : Locale.getISOCountries()) {
            System.out.print(isoCountry+ " ");
        }

        System.out.println("-------------");

        for (String isoLanguage : Locale.getISOLanguages()) {
            System.out.print(isoLanguage+ " ");
        }
    }
}
