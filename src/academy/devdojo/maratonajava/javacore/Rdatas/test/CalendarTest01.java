package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);

        c.add(Calendar.DAY_OF_MONTH, 5);
        Date d = c.getTime();
        System.out.println(d);
    }
}
