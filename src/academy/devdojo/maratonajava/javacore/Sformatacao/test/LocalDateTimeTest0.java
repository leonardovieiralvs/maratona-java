package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest0 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        LocalDate date = LocalDate.parse("2025-02-11");
        LocalTime time1 = LocalTime.parse("09:22:45");
        LocalDateTime localDateTime = date.atTime(time1);
        System.out.println("--");
        System.out.println(localDateTime);
        System.out.println("--");
        LocalDateTime date1 = time1.atDate(date);
        System.out.println(date1);
    }
}
