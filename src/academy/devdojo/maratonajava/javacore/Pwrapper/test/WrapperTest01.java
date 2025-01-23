package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        Integer cachorro = Integer.parseInt("3");
        Integer gato = Integer.parseInt("1");
        int i = gato;

        System.out.println(i);
        System.out.println(gato);
        System.out.println(cachorro);

        boolean isTrue = Boolean.parseBoolean("True");
        System.out.println(isTrue);

        Character charW = 'W';
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('D'));

    }
}
