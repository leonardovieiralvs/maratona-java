package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

public class TestDoTest {
    public static void main(String[] args) {

        diferencaDias();
    }

    public static void diferencaDias() {
        LocalDate date1 = LocalDate.of(1999,9, 28);
        LocalDate date2 = LocalDate.of(2025, 1, 28);
        Period periodo = Period.between(date1, date2);
        int days = periodo.getDays();
        int months = periodo.getMonths();
        int years = periodo.getYears();
        System.out.println("Dias: "+ days);
        System.out.println("Meses: "+ months);
        System.out.println("Anos: " + years);
    }
}
