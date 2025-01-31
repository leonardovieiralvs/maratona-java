package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
    }
}
