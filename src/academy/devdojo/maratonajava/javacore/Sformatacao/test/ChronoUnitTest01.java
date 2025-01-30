package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Local;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {

        LocalDate now1 = LocalDate.now();
        LocalDate now = LocalDate.of(1999, 9, 28);
        System.out.println(ChronoUnit.DAYS.between(now, now1));
        System.out.println(ChronoUnit.MONTHS.between(now, now1));
        System.out.println(ChronoUnit.YEARS.between(now, now1));
    }
}
