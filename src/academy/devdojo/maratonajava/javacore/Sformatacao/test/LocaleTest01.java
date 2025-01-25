package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeItaly2 = Locale.ITALY;

        Calendar calendar = Calendar.getInstance();
        DateFormat italy1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat italy2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly2);

        System.out.println("Italia: "+italy1.format(calendar.getTime()));
        System.out.println("Italia2: "+italy2.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(Locale.CHINA));

    }
}
