package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("----");

        LocalDate parse = LocalDate.parse("2025-01-30", DateTimeFormatter.ISO_DATE);
        System.out.println(parse);

        System.out.println("----");

        DateTimeFormatter formatoEua = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String format = LocalDate.now().format(formatoEua);
        System.out.println(format);
    }
}
