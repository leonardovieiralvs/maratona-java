package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "leozymhatake!@hotmail.com, !bira3351@gmail.com.br, magrinhoviradu@.com, lvsbomdebriga@mail.com.br, 11leo@.br";
        System.out.println(texto.split(",")[1]);
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
