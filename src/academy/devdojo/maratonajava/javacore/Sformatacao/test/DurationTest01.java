package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {

        LocalDateTime localDateNow = LocalDateTime.now();
        LocalDateTime localDateAfter = LocalDateTime.now().plusYears(2);
        Duration between1 = Duration.between(localDateNow, localDateAfter);
        System.out.println(between1);

        System.out.println("-----------");

        LocalTime timeNow = LocalTime.now();
        LocalTime timeAfter = LocalTime.now().plusHours(2);
        Duration between = Duration.between(timeNow, timeAfter);
        System.out.println(between);
    }
}
