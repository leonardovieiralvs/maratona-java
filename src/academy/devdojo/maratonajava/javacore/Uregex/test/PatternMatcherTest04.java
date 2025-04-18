package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        String regex = "0[xX][0-9a-fA-F]+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:   "+ texto);
        System.out.println("Indice:  0123456789\n");
        System.out.println("regex: "+ regex);
        System.out.println("Posiçoões encontradas");

        while (matcher.find()) {
            System.out.println(matcher.start()+ " " + matcher.group());
        }
    }
}
