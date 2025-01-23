package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "   Leonardo";
        String num = "012345";
        System.out.println(nome.charAt(2));
        System.out.println(nome.replace("Leonardo", "Goggins"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(num.length());
        System.out.println(num.substring(0,6));
        System.out.println(nome.substring(0, 2));
        System.out.println(nome);
        System.out.println(nome.trim());
    }
}
