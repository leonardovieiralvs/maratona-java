package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate after = LocalDate.of(2018, 3, 1);
        LocalDate after2 = LocalDate.of(2026, 2, 28);
        Period periodo = Period.between(after2, after);
        System.out.println(periodo);
    }
}
