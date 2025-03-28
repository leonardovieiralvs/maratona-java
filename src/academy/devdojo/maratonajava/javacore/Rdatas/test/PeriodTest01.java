package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate after = LocalDate.of(2018, 3, 1);
        LocalDate after2 = LocalDate.of(2026, 2, 28);
        Period periodo = Period.between(after2, after);
        System.out.println(periodo);
        System.out.println("--------------");

        Period period = Period.ofWeeks(50);
        System.out.println(period);
        System.out.println("-------");

        Period period1 = Period.ofWeeks(50);
        System.out.println(period1);
    }
}
