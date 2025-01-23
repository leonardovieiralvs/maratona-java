package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Leo";
        String nome2 = "Leo";
        nome1 = nome1.concat(" Souza");
        String nome3 = new String("a");

        System.out.println(nome1);
        System.out.println(nome1 == nome2);
    }
}
