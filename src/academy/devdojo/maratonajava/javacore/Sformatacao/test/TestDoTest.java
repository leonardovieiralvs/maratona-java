package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class TestDoTest {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("d 'de' MMMM 'de' yyyy");
        System.out.println(sdf.format(new Date()));
    }
}
